package com.example.Rest_Api_Part2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class RestApiPart2Application {

	public static void main(String[] args) {

		SpringApplication.run(RestApiPart2Application.class, args);
	}
		//public LocaleResolver localeResolver()
//		{
//			AcceptHeaderLocaleResolver localeResolver1 = new AcceptHeaderLocaleResolver();
//			localeResolver1.setDefaultLocale((Locale.ENGLISH));
//
//			return localeResolver1;
		}




