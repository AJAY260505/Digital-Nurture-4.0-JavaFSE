package com.cognizant.springlearn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Country;

@Repository
public class CountryDao {

    @Autowired
    private ApplicationContext context;

    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }

    public Country getCountry(String code) {
        List<Country> countries = getAllCountries();
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public void addCountry(Country country) {
        getAllCountries().add(country);
    }
}
