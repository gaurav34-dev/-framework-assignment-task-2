//create bean
package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public JavaWorld javaWorld() {
        return new JavaWorld();
    }

    @Bean
    public PythonWorld pythonWorld(JavaLanguage javaLanguage) {
        return new PythonWorld(javaLanguage);
    }

    @Bean
    public Framework framework() {
        return new Framework(pythonWorld(javaWorld()));
    }
}
