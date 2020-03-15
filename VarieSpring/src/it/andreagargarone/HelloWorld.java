package it.andreagargarone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="helloBean")
public class HelloWorld {
	
	@Autowired
	private Message messageM;

	public void setMessage(Message messageM){
		this.messageM = messageM;
	}

	public void printMessage(){
		System.out.println("Your Message : " + messageM.getMessage());
	}
}