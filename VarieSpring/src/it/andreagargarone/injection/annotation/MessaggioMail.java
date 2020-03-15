package it.andreagargarone.injection.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value="mail")
//@Service("mail")
//@Service(value="MessaggioMail")
public class MessaggioMail implements Messaggio {

	public MessaggioMail() {
		System.out.println("Costruttore Mail");
	}

	@Override
	public String getMessage2(String msgAnnotation3) {
		return "Email";		
	}

}
