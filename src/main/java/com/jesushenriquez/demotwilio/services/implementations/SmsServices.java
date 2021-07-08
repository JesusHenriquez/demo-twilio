package com.jesushenriquez.demotwilio.services.implementations;

import com.jesushenriquez.demotwilio.dtos.requests.SmsRequest;
import com.jesushenriquez.demotwilio.services.contracts.ISmsSenderServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SmsServices {
    private final ISmsSenderServices smsSender;

    public SmsServices(@Qualifier("twilio") TwilioSmsSenderServices TwilioSmsSender) {
        this.smsSender = TwilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
