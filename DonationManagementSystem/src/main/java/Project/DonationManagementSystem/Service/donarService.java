package Project.DonationManagementSystem.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.DonationManagementSystem.Exception.IdNotFoundException;
import Project.DonationManagementSystem.Repository.DonarRepository;
import Project.DonationManagementSystem.impl.donarServiceImpl;
import Project.DonationManagementSystem.model.Donar;

@Service
public class donarService implements donarServiceImpl{
	
	@Autowired
	DonarRepository donarRepository;

	@Override
	public Donar registerDonar(Donar donar) {
		try {			
			donarRepository.save(donar);
			return donar;
		}
		catch(Exception e) {
			return null;
		}
	}

	
	@Override
	public Donar getDonarById(long id) {
		
		return donarRepository.findById(id).orElse(null);
	}

	@Override
	public ArrayList<Donar> getAllDonars() {
		return (ArrayList<Donar>) donarRepository.findAll();
	}

	@Override
	public boolean deleteDonarById(long id) {
		Donar donar = this.getDonarById(id);
		donarRepository.delete(donar);
		return true;
		
	}

	@Override
	public ArrayList<Donar> getByNgoId(long id) {
		return donarRepository.getDonarByNgo(id);
		
	}

	@Override
	public Donar updateDonor(int id,Donar donar) {
		try {
			
			Donar tempDonar = this.getDonarById(id);
//			tempDonar.setId(donar.getId());
			tempDonar.setName(donar.getName());
			tempDonar.setUsername(donar.getUsername());
			tempDonar.setPassword(donar.getPassword());
			tempDonar.setEmail(donar.getEmail());
			tempDonar.setPhone(donar.getPhone()); 
			tempDonar.setAddress(donar.getAddress());
			donarRepository.save(tempDonar);
			return tempDonar;
		}
		catch(Exception e) {
			return null;
		}
	}

	

		
}
