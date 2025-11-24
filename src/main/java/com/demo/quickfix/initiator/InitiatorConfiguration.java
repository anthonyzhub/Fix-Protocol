package com.demo.quickfix.initiator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quickfix.DefaultMessageFactory;
import quickfix.MessageFactory;

@Configuration
public class InitiatorConfiguration {

    @Bean
    public MessageFactory messageFactory() {
        return new DefaultMessageFactory();
    }
}
