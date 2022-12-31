package com.qyj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.qyj.controller", "com.qyj.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
