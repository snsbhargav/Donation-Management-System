package Project.DonationManagementSystem.impl;

import java.util.List;
import java.util.Optional;

import Project.DonationManagementSystem.model.NGO;

public interface ngoServiceImpl {
	
	public NGO registerNgo(NGO ngo);
	
	public NGO updateNgo(NGO ngo);
	
	public NGO getNgoById(long id);
	
	public List<NGO> getAllNgos();
	
	
	
}
