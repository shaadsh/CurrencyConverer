package com.mycompany.myapp.interfaces;

import com.mycompany.myapp.domain.CurrenciesAPI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URI;
import java.util.List;

@FeignClient(value = "currencyInterface", url = "http://api.exchangeratesapi.io")
public interface CurrencyInterface {

    @GetMapping
    public CurrenciesAPI getCurrencies(URI uri);
}
