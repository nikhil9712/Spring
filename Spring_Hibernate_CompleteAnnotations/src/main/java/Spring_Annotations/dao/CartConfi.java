package Spring_Annotations.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"Spring_Annotations.dao","Spring_Annotations.dto","Spring.A","Spring.B"})
public class CartConfi {
    @Bean
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("Nikhil").createEntityManager();
	} 
}
