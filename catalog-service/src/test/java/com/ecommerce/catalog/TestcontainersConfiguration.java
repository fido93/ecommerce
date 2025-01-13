package com.ecommerce.catalog;

import org.springframework.boot.SpringApplication;

public class TestcontainersConfiguration {

    public static void main(String[] args) {
        SpringApplication.from(CatalogServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
