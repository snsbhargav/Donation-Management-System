package Project.DonationManagementSystem.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.DonationManagementSystem.Service.ngoService;
import Project.DonationManagementSystem.model.NGO;

@RestController
@CrossOrigin(origins = "*")

public class ngoController {
	@Autowired
	ngoService service;
	
	@PostMapping("/ngo")
	public NGO registerNgo(@RequestBody NGO ngo) {
		return service.registerNgo(ngo);
	}
	
	@PutMapping("/ngo")
	public NGO updateNgo(@RequestBody NGO ngo) {
		return service.updateNgo(ngo);
	}
	
	@GetMapping("/ngo/{id}")
	public NGO getNgoById(@PathVariable long id) {
		return service.getNgoById(id);
	}
	
}
