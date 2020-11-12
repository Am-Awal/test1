package com.tcs.ecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:db.properties")
@PropertySource("file://location")
public class DBConfig {

}
