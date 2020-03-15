package it.andreagargarone.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service(value="msgAnnotation")
public class SendMsg {
	
	@Autowired
	//@Qualifier("MessaggioMail")
	Messaggio mail;
	
	@Autowired
	//@Qualifier("MessaggioSms")
	Messaggio sms;
	
	public void setPippo(MessaggioMail messageM) {
		this.mail = messageM;
	}

	public void stampaMessaggio() {
		System.out.println("Messaggio : " + mail.getMessage2(""));
	}
	
	public void pippo() {
		System.out.println("Ciao!!!");
	}
	
	public void stampaMessaggioSms() {
		System.out.println("Messaggio : " + sms.getMessage2(""));
	}
}



