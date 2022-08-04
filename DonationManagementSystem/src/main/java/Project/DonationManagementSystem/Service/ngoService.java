package Project.DonationManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.DonationManagementSystem.Repository.NgoRepository;
import Project.DonationManagementSystem.impl.ngoServiceImpl;
import Project.DonationManagementSystem.model.NGO;

@Service
public class ngoService implements ngoServiceImpl{
	
	@Autowired
	NgoRepository ngoRepository;
	
	@Override
	public NGO registerNgo(NGO ngo) {
		ngoRepository.save(ngo);
		return ngo;
	}

	@Override
	public NGO updateNgo(NGO ngo) {
		NGO tempNgo = new NGO();
		tempNgo.setNgoId(ngo.getNgoId());
		tempNgo.setAddress(ngo.getAddress());
		tempNgo.setNgoDocuments(ngo.getNgoDocuments());
		tempNgo.setNgoName(ngo.getNgoName());
		tempNgo.setNgoStartedIn(ngo.getNgoStartedIn());
		tempNgo.setPassword(ngo.getPassword());
		tempNgo.setPhone_no(ngo.getPhone_no());
		tempNgo.setUsername(ngo.getUsername());
		ngoRepository.save(tempNgo);
		return tempNgo;
	}

	@Override
	public NGO getNgoById(long id) {
		return ngoRepository.findById(id).orElse(null);
	}

	@Override
	public List<NGO> getAllNgos() {
		return ngoRepository.findAll();
	}

}
