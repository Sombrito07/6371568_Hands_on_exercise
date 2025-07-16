package com.example.springrest.controller;

import com.example.springrest.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/country")
    public Country getCountry() {
        return new Country("IN", "India");
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        List<Country> countries = Arrays.asList(
                new Country("IN", "India"),
                new Country("US", "United States"),
                new Country("FR", "France")
        );
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
} 