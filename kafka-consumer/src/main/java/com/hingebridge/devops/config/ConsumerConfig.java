package com.hingebridge.devops.config;

import com.hingebridge.devops.model.Employee;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class ConsumerConfig {

    @Bean
    public Consumer<KStream<String, Employee>> newDevopsConsume(){
        return stream -> stream.foreach((key, value) ->
            System.out.println("--->> New Devops Staff: " + value + " successfully consumed")
        );
    }

    @Bean
    public Consumer<KStream<String, Employee>> newAccountsConsume(){
        return stream -> stream.foreach((key, value) ->
                System.out.println("--->> New Accounts Staff: " + value + " successfully consumed")
        );
    }
}
