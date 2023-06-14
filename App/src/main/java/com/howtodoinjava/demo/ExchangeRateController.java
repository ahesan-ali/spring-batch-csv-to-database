package com.howtodoinjava.demo;

import com.howtodoinjava.demo.model.ExchangeRateRequest;
import com.howtodoinjava.demo.model.ExchangeRateResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exchangeRate")
public class ExchangeRateController {

    @RequestMapping(value="/user",method = RequestMethod.POST)
    public ExchangeRateResponse checkExchangeRate(@RequestBody ExchangeRateRequest exchangeRateRequest){
        System.out.println("post request called from controller");
        System.out.println("excahnge Rate Object" + exchangeRateRequest.toString());
        return new ExchangeRateResponse("S","GHOO","Success");
    }
}
