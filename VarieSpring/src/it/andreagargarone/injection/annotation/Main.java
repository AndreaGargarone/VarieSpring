package it.andreagargarone.injection.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan(basePackages={"it.andreagargarone.injection.annotation"})
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SendMsg hw = (SendMsg) context.getBean("msgAnnotation");
        hw.stampaMessaggio();
        hw.stampaMessaggioSms();
	}
}
