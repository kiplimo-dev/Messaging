package com.collicode.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.validation.constraints.NotBlank;

public class SmsRequest {
@NotBlank
    private  final String phoneNumber;
@NotBlank
    private final String message;

    public SmsRequest(@JsonProperty("phoneNumber ")String phoneNumber,@JsonProperty("message") String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}