package com.example.microservicescurrencypersistance.service;

import com.example.microservicescurrencypersistance.model.Rate;
import com.example.microservicescurrencypersistance.repository.CurrencyDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyRateListener {
    private final CurrencyDataRepository currencyDataRepository;

    @RabbitListener(queues = "${rabbit.rate-queue}")
    public void getRate(Rate rate) {
        currencyDataRepository.save(rate);
    }


}
