package com.xyh.demo.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
     public void  addCorsMappings(CorsRegistry registry){
         registry.addMapping("/**")
                 .allowedOrigins("*")
                 .allowedMethods("GET","POST","PUT","OPTIONS","DELETE")
                 .allowCredentials(true)
                 .maxAge(3600)
                 .allowedHeaders("*");

     }
}
