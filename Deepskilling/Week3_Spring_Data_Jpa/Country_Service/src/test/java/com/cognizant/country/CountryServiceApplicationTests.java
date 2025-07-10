package com.cognizant.country;

import com.cognizant.entity.Country;
import com.cognizant.repository.CountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CountryServiceApplicationTests {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    void contextLoads() {
        assertThat(countryRepository).isNotNull();
    }

    @Test
    void testFindAllCountries() {
        List<Country> countries = countryRepository.findAll();
        assertThat(countries).isNotNull();
    }
}
