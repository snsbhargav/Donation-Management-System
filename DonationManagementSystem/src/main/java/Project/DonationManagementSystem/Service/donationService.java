package Project.DonationManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.DonationManagementSystem.Repository.DonationRepository;
import Project.DonationManagementSystem.impl.donationServiceImpl;
import Project.DonationManagementSystem.model.Donation;

@Service
public class donationService implements donationServiceImpl{

	@Autowired
	DonationRepository donationRepository;

	@Override
	public Donation addDonation(Donation donation) {
		return donationRepository.save(donation);
	}

	@Override
	public Donation updateDonation(Donation donation) {
		Donation tempDonation = new Donation();
		tempDonation.setId(donation.getId());
		tempDonation.setAmount(donation.getAmount());
		tempDonation.setDonationType(donation.getDonationType());
		tempDonation.setDonationDate(donation.getDonationDate());
		tempDonation.setDonarId(donation.getDonarId());
		tempDonation.setNgoId(donation.getNgoId());
		donationRepository.save(tempDonation);
		return tempDonation;
	}

	@Override
	public boolean deleteDonation(long id) {
		
		try{
			donationRepository.deleteById(id);
			return true;
		}
		catch(Exception e) {
			return false;
		}
			
	}

	@Override
	public Optional<Donation> getDonationById(long id) {
		return donationRepository.findById(id);
	}

	@Override
	public List<Donation> getAllDonations() {
		// TODO Auto-generated method stub
		return donationRepository.findAll();
	}
	
	public List<Donation> getByDonarId(long id){
		return donationRepository.getDonationByDonarId(id);
	}
	
	public List<Donation> getByNgoId(long id){
		return donationRepository.getDonationByNgoId(id);
	}
	
}
