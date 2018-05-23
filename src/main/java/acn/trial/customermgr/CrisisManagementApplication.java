package acn.trial.customermgr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import acn.trial.customermgr.entities.Crisis;
import acn.trial.customermgr.repositories.CrisisRepository;

@SpringBootApplication
public class CrisisManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrisisManagementApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner onStart(CrisisRepository crisisReposostory) {
		return (args)->{
			if (crisisReposostory.count() == 0) {
				Crisis crisis = new Crisis("flood");
				crisisReposostory.save(crisis);
				
			}
		};
		
	}
}
