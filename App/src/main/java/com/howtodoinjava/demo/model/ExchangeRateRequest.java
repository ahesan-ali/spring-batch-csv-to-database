package com.howtodoinjava.demo.model;


public class ExchangeRateRequest {
    private double offerRate;
    private double bidRate;
    private String name;

    public ExchangeRateRequest(double offerRate, double bidRate, String name) {
        this.offerRate = offerRate;
        this.bidRate = bidRate;
        this.name = name;
    }

    public double getOfferRate() {
        return offerRate;
    }

    public void setOfferRate(double offerRate) {
        this.offerRate = offerRate;
    }

    public double getBidRate() {
        return bidRate;
    }

    public void setBidRate(double bidRate) {
        this.bidRate = bidRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExchangeRateRequest{" +
                "offerRate=" + offerRate +
                ", bidRate=" + bidRate +
                ", name='" + name + '\'' +
                '}';
    }
}
