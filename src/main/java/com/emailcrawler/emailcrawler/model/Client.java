package com.emailcrawler.emailcrawler.model;
import lombok.Data;

@Data
public class Client {
    private String clientId;
    private String authUri;
    private String tokenUri;
    private String clientSecret;
}
