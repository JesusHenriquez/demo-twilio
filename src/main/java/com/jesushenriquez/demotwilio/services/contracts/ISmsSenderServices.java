package com.jesushenriquez.demotwilio.services.contracts;

import com.jesushenriquez.demotwilio.dtos.requests.SmsRequest;

public interface ISmsSenderServices {
    void sendSms(SmsRequest smsRequest);
}
