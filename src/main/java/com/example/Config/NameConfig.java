package com.example.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "default.name")
@EnableConfigurationProperties
public class NameConfig {

    @Value("${default.name.kelvin}")
    private String kelvin;

    @Value("${default.name.alex}")
    private String alex;

    public String getKelvin() {
        return kelvin;
    }

    public void setKelvin(String kelvin) {
        this.kelvin = kelvin;
    }

    public String getAlex() {
        return alex;
    }

    public void setAlex(String alex) {
        this.alex = alex;
    }
}
