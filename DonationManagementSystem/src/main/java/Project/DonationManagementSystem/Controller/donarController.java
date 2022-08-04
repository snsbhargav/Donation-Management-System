package Project.DonationManagementSystem.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.DonationManagementSystem.Service.donarService;
import Project.DonationManagementSystem.model.Donar;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class donarController {
	@Autowired
	donarService service;
	
	@PostMapping("/donar")
	public Donar registerADonar(@Valid @RequestBody Donar donar) {
		return service.registerDonar(donar);
	}
	
	@PutMapping("/donar/{id}")
	public Donar updateDonar(@PathVariable int id,@Valid @RequestBody Donar donar) {
		return service.updateDonor(id,donar);
	}
	
	@GetMapping("/donar/{id}")
	public Donar getDonarById(@PathVariable long id) {
		return service.getDonarById(id);
	}
	
	@GetMapping("/all-donars")
	public ArrayList<Donar> getAllDonars(){
		return service.getAllDonars();
	}
	
	@DeleteMapping("/donar/{id}")
	public boolean deleteDonar(@PathVariable long id) {
		return service.deleteDonarById(id);
	}
	
	@GetMapping("/donar/ngo-id/{id}")
	public ArrayList<Donar> getByNgoId(@PathVariable long id) {
		return service.getByNgoId(id);
		
	}
}
