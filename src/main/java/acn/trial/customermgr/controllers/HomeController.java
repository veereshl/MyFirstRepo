package acn.trial.customermgr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import acn.trial.customermgr.entities.Crisis;
import acn.trial.customermgr.service.CrisisService;

@Controller
public class HomeController {
    
	private CrisisService crisisService;
	
	@Autowired
	public HomeController(CrisisService crisisService) {
		this.crisisService = crisisService;
	}
	
	@GetMapping("/")
	public String getAllCrisis(Model model){
		List<Crisis> list = crisisService.getAllCrisis();
		model.addAttribute("list", list);
		return "home";
	}
	
}
