package Project.DonationManagementSystem.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Project.DonationManagementSystem.Service.donationService;
import Project.DonationManagementSystem.model.Donation;

@RestController
@CrossOrigin(origins = "*")

public class donationController {

	@Autowired
	donationService service;
	
	@PostMapping("/donation")
	public Donation registerADonation(@RequestBody Donation donation) {
		return service.addDonation(donation);
	}
	
	@PutMapping("/donation")
	public Donation updateDonation(@RequestBody Donation donation) {
		return service.updateDonation(donation);
	}
	
	@GetMapping("/donation/{id}")
	public Optional<Donation> getDonationById(@PathVariable long id) {
		return service.getDonationById(id);
	}
	
	@DeleteMapping("/donation/{id}")
	public boolean deleteDonation(@PathVariable long id) {
		return service.deleteDonation(id);
	}
	
	@GetMapping("/all-donations")
	public List<Donation> getAllDonations(){
		return service.getAllDonations();
	}
	
	@GetMapping("/donations/donar-id/{id}")
	public List<Donation> getByDonarId(@PathVariable long id){
		return service.getByDonarId(id);
	}
	
	@GetMapping("/donations/ngo-id/{id}")
	public List<Donation> getByNgoId(@PathVariable long id){
		return service.getByNgoId(id);
	}
	
	
}
