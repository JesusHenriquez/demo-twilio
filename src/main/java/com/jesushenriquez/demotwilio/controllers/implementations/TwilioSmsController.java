package com.jesushenriquez.demotwilio.controllers.implementations;

import com.jesushenriquez.demotwilio.controllers.contracts.ITwilioSmsController;
import com.jesushenriquez.demotwilio.dtos.requests.SmsRequest;
import com.jesushenriquez.demotwilio.services.implementations.SmsServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms")
public class TwilioSmsController implements ITwilioSmsController {

    private final SmsServices smsService;

    public TwilioSmsController(SmsServices smsService) {
        this.smsService = smsService;
    }

    @Override
    @PostMapping(path = "/send")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        this.smsService.sendSms(smsRequest);
    }
}
