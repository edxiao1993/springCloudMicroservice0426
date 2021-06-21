package org.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Kevin.Z
 * @version 2021/6/22
 */
@SpringBootApplication
@EnableEurekaClient
public class DbServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbServiceApplication.class, args);
    }
}
