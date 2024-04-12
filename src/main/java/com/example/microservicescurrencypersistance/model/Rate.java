package com.example.microservicescurrencypersistance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Rate {
    private String currency;
    @Id
    private String code;
    private BigDecimal bid;//sprzedaż
    private BigDecimal ask;//kupno

}
