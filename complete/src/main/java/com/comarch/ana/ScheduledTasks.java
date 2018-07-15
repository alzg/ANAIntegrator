package com.comarch.ana;

import Request.Rates.Forward.FRA_Index.InstRefDataReporting.Attributes;
import Request.Rates.Forward.FRA_Index.InstRefDataReporting.Header;
import Request.Rates.Forward.FRA_Index.InstRefDataReporting.RequestRatesForwardFRAIndexInstRefDataReporting;
import Response.Rates.Forward.FRA_Index.InstRefDataReporting.V1.RatesForwardFRAIndex;
import com.comarch.ana.db.Model.Customer;
import com.comarch.ana.db.dao.CustomerRepository;
import com.comarch.ana.exceptions.ANAIntegratorException;
import com.comarch.ana.util.Utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
@ConfigurationProperties

public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private final ANARestAPIService anaRestAPIService;
    @Autowired
    CustomerRepository customerRepository;
    @Value("${endpoint}")
    private String endpoint;

    @Qualifier("otc")
    @Autowired
    private DataSource dataSource;

    @Qualifier("gmk")
    @Autowired
    private DataSource dataSourceGmk;

    public ScheduledTasks(ANARestAPIService anaRestAPIService) {
        this.anaRestAPIService = anaRestAPIService;
    }

    @Scheduled(cron = "${cronExpressionFile}")
    private void sendFile() throws Exception {
        log.info("Sending a file");

        // Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
        //  CompletableFuture<ResponseEntity<String>> page1 = anaRestAPIService.getISIN("PivotalSoftware");
        //  CompletableFuture<ResponseEntity<String>> page2 = anaRestAPIService.getISIN("CloudFoundry");
        //   CompletableFuture<ResponseEntity<String>> page3 = anaRestAPIService.getISIN("Spring-Projects");

        // Wait until they are all done
        //  CompletableFuture.allOf(page1,page2,page3).join();

        // Print results, including elapsed time
        log.info("Elapsed time: " + (System.currentTimeMillis() - start));
        //  log.info("--> " + page1.get());
        //  log.info("--> " + page2.get());
        //  log.info("--> " + page3.get());

        Header header = new Header();
        header.setAssetClass(Header.AssetClass.RATES);
        header.setInstrumentType(Header.InstrumentType.FORWARD);
        header.setUseCase(Header.UseCase.FRA_INDEX);
        header.setLevel(Header.Level.INST_REF_DATA_REPORTING);
        Attributes attributes = new Attributes();
        attributes.setNotionalCurrency(Attributes.NotionalCurrency.PLN);
        attributes.setExpiryDate("2018-03-05");
        attributes.setReferenceRate(Attributes.ReferenceRate.PLN_WIBOR_WIBO);
        attributes.setReferenceRateTermValue((long) 3);
        attributes.setReferenceRateTermUnit(Attributes.ReferenceRateTermUnit.MNTH);
        attributes.setDeliveryType(Attributes.DeliveryType.CASH);
        attributes.setPriceMultiplier(1.0);

        RequestRatesForwardFRAIndexInstRefDataReporting rfFRAIndex = new
                RequestRatesForwardFRAIndexInstRefDataReporting();
        rfFRAIndex.setHeader(header);
        rfFRAIndex.setAttributes(attributes);

        ObjectMapper mapper = new ObjectMapper();
        String input = null;
        try {
            input = "{ \"record\":" + mapper.writeValueAsString(rfFRAIndex) + "}";
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("TEST:" + endpoint);

        ResponseEntity<String> respEntity = restTemplate.postForEntity(endpoint, new HttpEntity<String>(input,
                anaRestAPIService.buildHttpHeaders()), String.class);

        System.out.println("Request:");
        Utils.formatJsonString(input);

        System.out.println("Response:");
        Utils.formatJsonString(respEntity.getBody());

        Utils.Response response = null;
        try {
            response = Utils.parseResponse(respEntity.getBody());
        } catch (ANAIntegratorException e) {
            e.printStackTrace();
        }

        System.out.println("record: " + response.getRecord() + "\r\n:" + response.getResponseCode());

        try {
            RatesForwardFRAIndex data = mapper.readValue(response.getRecord(), RatesForwardFRAIndex.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "${cronExpressionDB}")
    private void sendDB() {
        log.info("Sending a DB");

        System.out.println("DATASOURCE = " + dataSource);

        System.out.println("Display all customers OTC...");
        List<Customer> list = customerRepository.findAll();
        list.forEach(x -> System.out.println(x.getId() + x.getName()));

        System.out.println("Display all customers GMK...");
        list = customerRepository.findAllGmk();
        list.forEach(x -> System.out.println(x.getId() + x.getName()));

        System.out.println("Done!");
    }

}