package com.aapeli.springpattern;

import com.aapeli.springpattern.creational.prototype.ProtoFalse;
import com.aapeli.springpattern.creational.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.net.ProtocolFamily;

@SpringBootApplication
public class SpringPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPatternApplication.class, args);
    }


    @Bean
    public ProtoTrue proto1() {
        return new ProtoTrue();
    }

    @Bean
    @Scope("prototype")
    public ProtoFalse proto2() {
        return new ProtoFalse();
    }

}
