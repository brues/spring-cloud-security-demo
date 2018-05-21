package com.blues.main;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

/**
 * @author Administrator
 */
@Configuration
public class OAuth2FeignAutoConfiguration {

    @Autowired
    OAuth2ClientContext oauth2ClientContext;


    @Bean
    public RequestInterceptor oauth2FeignRequestInterceptor(OAuth2ProtectedResourceDetails oAuth2ProtectedResourceDetails) {
        return new OAuth2FeignRequestInterceptor(oauth2ClientContext, oAuth2ProtectedResourceDetails);
    }
}

