package com.samtech.poc;

import com.samtech.poc.Samoauth21App;
import com.samtech.poc.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Samoauth21App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
