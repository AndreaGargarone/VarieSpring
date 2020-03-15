package it.andreagargarone.injection.annotation;

import org.springframework.stereotype.Service;

@Service
public interface Messaggio {
	String getMessage2(String msgAnnotation);
}
