package gurus.springframework.jokeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {
    @Bean
    public ChuckConfiguration chuckNorrisQuotes(){
        return new ChuckConfiguration();
    }
}
