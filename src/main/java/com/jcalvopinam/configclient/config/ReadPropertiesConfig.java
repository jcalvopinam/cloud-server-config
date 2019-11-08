package com.jcalvopinam.configclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Data
@Component
@ConfigurationProperties("service")
public class ReadPropertiesConfig {

    private LinkedHashMap<String, String> message;

}
