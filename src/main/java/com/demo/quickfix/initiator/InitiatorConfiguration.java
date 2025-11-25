package com.demo.quickfix.initiator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.MessageFactory;
import quickfix.SessionSettings;

@Configuration
public class InitiatorConfiguration {

    @Bean
    public MessageFactory messageFactory() {
        return new DefaultMessageFactory();
    }

    @Bean
    public SessionSettings sessionSettings() throws ConfigError {
        return new SessionSettings("quickfixj-initiator.cfg");
    }
}
