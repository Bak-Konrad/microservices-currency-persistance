package com.example.microservicescurrencypersistance.repository;

import com.example.microservicescurrencypersistance.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyDataRepository extends JpaRepository<Rate,String> {

}
