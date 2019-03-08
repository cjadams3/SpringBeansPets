package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Pets;

@Configuration
public class BeanConfiguration {

	@Bean
	public Pets pets() {
		Pets bean = new Pets();
		bean.setType("Chicken");
		bean.setName("Ricky");
		bean.setAge(1);
		bean.setColor("Yellow");
		bean.setHashair(false);
		return bean;
	}
}
