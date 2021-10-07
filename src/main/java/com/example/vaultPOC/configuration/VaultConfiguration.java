package com.example.vaultPOC.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ConfigurationProperties("example")
public class VaultConfiguration {

//        @Value("${username}")
//    private String username;

//    @Value("${pass}")
    private String pass;

//    public String getUsername() {
//        return username;
//    }

//    public void setUser(String user) {
//        this.user = user;
//    }

    public String getPass() {
        return pass;
    }

//    public void setPass(String pass) {
//        this.pass = pass;
//    }
}
