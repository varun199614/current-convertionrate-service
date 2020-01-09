package com.project2.microservices.currentconvertionrateservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.microservices.currentconvertionrateservice.beans.ExchangeRates;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRates, Integer>  {
 public ExchangeRates findByFromCountryAndToCountry(String fromCountry,String toCountry);
}
