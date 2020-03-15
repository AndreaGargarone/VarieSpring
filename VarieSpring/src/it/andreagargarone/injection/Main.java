package it.andreagargarone.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        SendMsg hw = (SendMsg) context.getBean("msg");
        hw.stampaMessaggio();
	}
}
