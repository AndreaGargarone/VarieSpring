package it.andreagargarone.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.andreagargarone.Message;

//@Component(value="msg")
public class SendMsg {
	
	//@Autowired
	Messaggio msg;
	
	public void setPippo(Messaggio messageM){
		this.msg = messageM;
	}
	
	public void stampaMessaggio() {
		System.out.println("Messaggio : " + msg.getMessage2());
	}
}



