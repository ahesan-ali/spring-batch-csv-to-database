package com.howtodoinjava.demo.config;
 
import com.howtodoinjava.demo.model.ExchangeRateRequest;
import com.howtodoinjava.demo.model.ExchangeRateResponse;
import org.springframework.batch.item.ItemProcessor;

import com.howtodoinjava.demo.model.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class DBLogProcessor implements ItemProcessor<Employee, Employee>
{
    String url="http://localhost:8080//api/exchangeRate/user";
     WebClient webClient = WebClient.builder().build();


    public Employee process(Employee employee) throws Exception
    {
        System.out.println("Inserting employee : " + employee);
        ExchangeRateRequest exchangeRateRequest =new ExchangeRateRequest(12.00,34.00,"exchangeRate");
        System.out.println("start calling post call - request ="+exchangeRateRequest.toString());
        ExchangeRateResponse exchangeRateResponse = webClient.post()
                .uri(url)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(exchangeRateRequest), ExchangeRateRequest.class)
                .retrieve()
                .bodyToMono(ExchangeRateResponse.class).block();
        System.out.println("end calling post call response ="+exchangeRateResponse.toString());
        return employee;
    }
}