package com.ecommerce.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(ContainersConfig.class)
@SpringBootTest
class CatalogServiceApplicationTests extends AbstractT{

    @Test
    void contextLoads() {}
}
