package it.andreagargarone.injection;

import org.springframework.stereotype.Component;

//@Component(value="messaggioMail")
public class MessaggioMail implements Messaggio {

	@Override
	public String getMessage2() {
		return "Email";		
	}

}
