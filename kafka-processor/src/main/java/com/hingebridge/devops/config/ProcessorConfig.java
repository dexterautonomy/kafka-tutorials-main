package com.hingebridge.devops.config;

import com.hingebridge.devops.model.Employee;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ProcessorConfig {

    @Bean
    public Function<KStream<String, Employee>, KStream<String, Employee>> newDevops(){
        return kstream -> kstream.filter((key, value) -> {
            System.out.println("--->> Processing New Devops Staff: " + value);
            return value.getDept() == Employee.Department.DEVOPS;
        });
    }

    @Bean
    public Function<KStream<String, Employee>, KStream<String, Employee>> newAccounts(){
        return kstream -> kstream.filter((key, value) -> {
            System.out.println("--->> Processing New Accounts Staff: " + value);
            return value.getDept() == Employee.Department.ACCOUNTS;
        });
    }
}
