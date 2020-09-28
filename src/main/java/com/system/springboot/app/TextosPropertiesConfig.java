package com.system.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySources({
        @PropertySource(value = "classpath:textos.yaml", factory = YamlPropertySourceFactory.class)
})
public class TextosPropertiesConfig {
}
