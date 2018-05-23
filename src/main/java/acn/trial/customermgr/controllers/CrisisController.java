package acn.trial.customermgr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import acn.trial.customermgr.entities.Crisis;
import acn.trial.customermgr.service.CrisisService;

@RestController
public class CrisisController {
	
	private CrisisService crisisService;
	
	@Autowired
	public CrisisController(CrisisService crisisService) {
		this.crisisService = crisisService;
	}
	
	@PostMapping("/create")
	public void createCrisis(@RequestBody Crisis crisis) {
		Crisis c = new Crisis();
		c.setDescription(crisis.getDescription());		
		crisisService.createCrisis(c);
	}
	
	
	
	@GetMapping("/get/{id}")
	public Crisis getById(@PathVariable("id") String id) {
		Crisis crisis = crisisService.getById(Integer.parseInt(id));
		return crisis;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCrisis(@PathVariable("id") String id) {
		crisisService.deleteCrisis(Integer.parseInt(id));
	}


}
