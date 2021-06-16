package org.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Kevin.Z
 * @version 2021/6/11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FrontEndApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontEndApplication.class, args);
    }
}
