package com.song.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author song
 * @version 1.0
 * Create by 2022/8/3 9:31
 */
public class ServlerContaine extends AbstractDispatcherServletInitializer {
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(SpringMvcConfig.class);

        return  context;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
