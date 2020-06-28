package com.myth.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author myth
 * @Date 2020-06-21 18:02
 */
@Component("user")
@Scope("prototype")
public class User {
    @Value("李四")
    public String name;
}
