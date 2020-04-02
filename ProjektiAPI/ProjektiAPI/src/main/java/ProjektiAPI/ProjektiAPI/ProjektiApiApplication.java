package ProjektiAPI.ProjektiAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ProjektiAPI.ProjektiAPI.utils.PopulateDB;



@SpringBootApplication
public class ProjektiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektiApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PopulateDB populateDb) {
		return (args) -> {
			populateDb.populate();
		};
	}

}