package com.app.kiteconnect.configurations;


import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Configuration
@ConfigurationProperties(prefix = "kiteconnect")
@Setter
public class KiteconnectProperties {

    private List<Configs> configs;
    private String loginurl;

    public List<Configs> getConfigs(){
        return Optional.ofNullable(configs).orElseGet(ArrayList::new);
    }

    public String getLoginurl() {
        return loginurl;
    }
}
