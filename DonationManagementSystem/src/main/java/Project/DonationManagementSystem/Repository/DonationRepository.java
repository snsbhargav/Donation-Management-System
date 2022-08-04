package Project.DonationManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Project.DonationManagementSystem.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long>{
	
	@Query(value="SELECT * FROM Donation_Table d WHERE d.donar_id= ?1",nativeQuery = true)
	public List<Donation> getDonationByDonarId(long id);

	@Query(value="SELECT * FROM Donation_Table d WHERE d.ngo_id= ?1",nativeQuery = true)
	public List<Donation> getDonationByNgoId(long id);
}
