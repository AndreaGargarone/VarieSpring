package it.andreagargarone.injection.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component(value="sms")
// oppure                    
//@Component("sms")               => MATCH BY NAME
// oppure
@Service("sms")


//@Service("MessaggioSms")

public class MessaggioSms implements Messaggio {
	
	public MessaggioSms() {
		System.out.println("Costruttore SMS");
	}

	@Override
	public String getMessage2(String msgAnnotation) {
		return "MSG: SMS";
	}

}
