package com.babel.ahorcado;

import com.babel.ahorcado.applications.AhorcadoApp;
import com.babel.ahorcado.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AhorcadoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AhorcadoApp calculadoraApp = context.getBean(AhorcadoApp.class);

		calculadoraApp.run();;
	}

}
