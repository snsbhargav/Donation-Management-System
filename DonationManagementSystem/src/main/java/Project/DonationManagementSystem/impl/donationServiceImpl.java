package Project.DonationManagementSystem.impl;

import java.util.List;
import java.util.Optional;

import Project.DonationManagementSystem.model.Donation;

public interface donationServiceImpl {
	
	public Donation addDonation(Donation donation);
	
	public Donation updateDonation(Donation donation);
	
	public boolean deleteDonation(long id);
	
	public Optional<Donation> getDonationById(long id);
	
	public List<Donation> getAllDonations();
	
	
	
}
