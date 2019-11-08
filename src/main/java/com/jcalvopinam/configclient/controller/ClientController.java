package com.jcalvopinam.configclient.controller;

import com.jcalvopinam.configclient.config.ReadPropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final ReadPropertiesConfig readPropertiesConfig;

    @Autowired
    public ClientController(
            final ReadPropertiesConfig readPropertiesConfig) {
        this.readPropertiesConfig = readPropertiesConfig;
    }

    @GetMapping
    public ReadPropertiesConfig loadProperties() {
        return readPropertiesConfig;
    }

}
