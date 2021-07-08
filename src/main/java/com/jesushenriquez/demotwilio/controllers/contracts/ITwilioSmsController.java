package com.jesushenriquez.demotwilio.controllers.contracts;

import com.jesushenriquez.demotwilio.dtos.requests.SmsRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface ITwilioSmsController {

    public void sendSms(@RequestBody SmsRequest smsRequest);

}
