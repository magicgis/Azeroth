package com.ease.azeroth.core.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by fumanix on 2/24/16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisRepository {

    String value() default "";
}
