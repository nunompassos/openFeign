package com.test.openfeign.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EchoResponse {
    private Args args;
    private Headers headers;
    private String url;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Args {
        private String param1;
        private String param2;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Headers {
        private String xForwardedProto;
        private String xForwardedPort;
        private String host;
        private String xAmznTraceId;
        private String userAgent;
        private String accept;
        private String postmanToken;
        private String acceptEncoding;
    }
}
