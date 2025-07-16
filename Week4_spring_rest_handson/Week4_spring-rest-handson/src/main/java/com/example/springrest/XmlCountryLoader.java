package com.example.springrest;

import com.example.springrest.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlCountryLoader {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Country country = (Country) context.getBean("country");
        System.out.println("Country code: " + country.getCode());
        System.out.println("Country name: " + country.getName());
    }
} 