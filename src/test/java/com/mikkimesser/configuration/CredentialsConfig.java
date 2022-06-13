package com.mikkimesser.configuration;

import org.aeonbits.owner.Config;
@Config.Sources("classpath:configuration/credentials.properties")
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
