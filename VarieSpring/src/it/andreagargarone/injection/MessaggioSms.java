package it.andreagargarone.injection;

import org.springframework.stereotype.Component;

//@Component(value="messaggioSMS")
public class MessaggioSms implements Messaggio {

	@Override
	public String getMessage2() {
		return "SMS";
	}

}
