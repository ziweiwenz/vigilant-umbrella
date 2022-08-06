package com.song.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author song
 * @version 1.0
 * Create by 2022/8/4 15:27
 */
@Configuration
@ComponentScan("com.song.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
