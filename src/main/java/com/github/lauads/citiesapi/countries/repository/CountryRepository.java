package com.github.lauads.citiesapi.countries.repository;

import com.github.lauads.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
