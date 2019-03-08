package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Pets;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PetsRepository;

@SpringBootApplication
public class SpringBeansPetsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansPetsApplication.class, args);
	}

	@Autowired
	PetsRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Pets p = appContext.getBean("pets", Pets.class); 
		repo.save(p); // Save pet declared in spring configuration factory
		
		
		Pets pet = new Pets("Rabbit", "Fluffy", 2, "White", true);
		repo.save(pet); // Save pet not managed by spring
		
		
		List<Pets> allPets = repo.findAll();
		for(Pets animal : allPets) {
			System.out.println(animal.toString());
		}
	}
}
