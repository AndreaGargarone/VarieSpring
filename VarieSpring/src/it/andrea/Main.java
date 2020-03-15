package it.andrea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
interface Sender {
	public abstract void send(String msg);
}

@Component
class SendEmail implements Sender {
	
	@Override
	public void send(String msg) {
		System.out.println("Manda MAIL: " + msg);
	}
}

@Component
class SendSMS implements Sender {
	
	@Override
	public void send(String msg) {
		System.out.println("Manda SMS: " + msg);
	}
}

public class Main {
	
	@Autowired
	private Sender sender;
	
	String msg = "hello world";
	
	public void stampa() {
		sender.send(msg);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.stampa();
	}
	
}
