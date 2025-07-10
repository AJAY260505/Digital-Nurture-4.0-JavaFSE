package com.cognizant.service;

import com.cognizant.entity.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countries = new ArrayList<>();

    public CountryService() {
        Country c1 = new Country();
        c1.setCode("IN");
        c1.setName("India");

        Country c2 = new Country();
        c2.setCode("US");
        c2.setName("United States");

        countries.add(c1);
        countries.add(c2);
    }

    public Country getCountryByCode(String code) {
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public Country addCountry(Country country) {
        countries.add(country);
        return country;
    }

    public Country updateCountry(Country updatedCountry) {
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getCode().equalsIgnoreCase(updatedCountry.getCode())) {
                countries.set(i, updatedCountry);
                return updatedCountry;
            }
        }
        return null;
    }

    public void deleteCountry(String code) {
        countries.removeIf(country -> country.getCode().equalsIgnoreCase(code));
    }

    public List<Country> getCountriesByPartialName(String name) {
        return countries.stream()
                .filter(country -> country.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}
