package com.tcs.mvcdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc // it activates the mvc env (@requestbody, controller, response body, requestmapping, @valid, ...)
@ComponentScan("com.tcs.mvcdemo")
public class WebConfig {

}
