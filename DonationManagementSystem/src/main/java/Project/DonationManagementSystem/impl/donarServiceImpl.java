package Project.DonationManagementSystem.impl;

import java.util.ArrayList;
import java.util.Optional;

import Project.DonationManagementSystem.model.Donar;

public interface donarServiceImpl {
	public Donar registerDonar(Donar donar);
		
	public Donar getDonarById(long id);
	
	public ArrayList<Donar> getAllDonars();
	
	public boolean deleteDonarById(long id);
	
	public ArrayList<Donar> getByNgoId(long id);

	Donar updateDonor(int id, Donar donar);

}
