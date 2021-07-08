package com.jesushenriquez.demotwilio.dtos.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class SmsRequest {
    @NotBlank
    private final String to;
    @NotBlank
    private final String message;
    public SmsRequest(@JsonProperty("to") String to,
                      @JsonProperty("message") String message) {
        this.to = to;
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsRequest{to: " + to + ", message: " + message + "}";
    }

}
