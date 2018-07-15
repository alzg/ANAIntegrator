package com.comarch.ana.util;

import com.comarch.ana.exceptions.ANAIntegratorException;
import com.comarch.ana.exceptions.ANAIntegratorIOException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {
    public static void formatJsonString(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Object jsonObject = mapper.readValue(json, Object.class);
            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
            System.out.println(prettyJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Response parseResponse(String jsonResponse) throws ANAIntegratorException {
        Pattern pattern = Pattern.compile("(.*\"record\".*)(\\{.*\"Header\".*)(,.*\"responseCode\"[^\\d])(.*)(\\})", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(jsonResponse);
        matcher.find();
        String responseCode;
        String record;
        try {
            record = matcher.group(2);
            responseCode = matcher.group(4);
        } catch (IllegalStateException | IndexOutOfBoundsException e) {
            throw new ANAIntegratorIOException(
                    "Error parsing response: "
                            + jsonResponse.substring(1, 256), e);
        }
        int responseCodeInt;
        try {
            responseCodeInt = Integer.parseInt(responseCode.trim());
        } catch (NumberFormatException e) {
            throw new ANAIntegratorIOException("Error parsing responseCode", e);
        }
        return new Response(record, responseCodeInt);
    }

    public <T> CompletableFuture<List<T>> allOf(List<CompletableFuture<T>> futuresList) {
        CompletableFuture<Void> allFuturesResult =
                CompletableFuture.allOf(futuresList.toArray(new CompletableFuture[futuresList.size()]));
        return allFuturesResult.thenApply(v ->
                futuresList.stream().
                        map(future -> future.join()).
                        collect(Collectors.<T>toList())
        );
    }

    public static class Response {
        String record;
        int responseCode;

        public Response(String record, int responseCode) {
            this.record = record;
            this.responseCode = responseCode;
        }

        public String getRecord() {
            return record;
        }

        public void setRecord(String record) {
            this.record = record;
        }

        public int getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(int responseCode) {
            this.responseCode = responseCode;
        }
    }
}


