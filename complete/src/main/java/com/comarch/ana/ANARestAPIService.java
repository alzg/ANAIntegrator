package com.comarch.ana;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
@ConfigurationProperties
public class ANARestAPIService {

    private static final Logger log = LoggerFactory.getLogger(ANARestAPIService.class);

    @Autowired
    public CustomProperties cp;

    @Value("#{${endpoint.headers}}")
    private Map<String, List<String>> headersParams;

    private final RestTemplate restTemplate;

    @Value("${endpoint}")
    private String endpoint;

    public ANARestAPIService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public HttpHeaders buildHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.putAll(headersParams);
        return headers;
    }

    @Async
    public CompletableFuture<ResponseEntity<String>> getISIN(String product) throws InterruptedException {
        log.info("Looking up");
        log.debug("Looking up:\n\r" + product);
        ResponseEntity<String> respEntity = restTemplate.postForEntity(endpoint, new HttpEntity<String>(product,
                buildHttpHeaders()), String.class);
        return CompletableFuture.completedFuture(respEntity);
    }
}