package com.howtodoinjava.demo.model;

public class ExchangeRateResponse {
    private String code;
    private String errorCode;
    private String errorDescription;

    public String getCode() {
        return code;
    }

    public ExchangeRateResponse() {
    }

    @Override
    public String toString() {
        return "ExchangeRateResponse{" +
                "code='" + code + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }

    public ExchangeRateResponse(String code, String errorCode, String errorDescription) {
        this.code = code;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
