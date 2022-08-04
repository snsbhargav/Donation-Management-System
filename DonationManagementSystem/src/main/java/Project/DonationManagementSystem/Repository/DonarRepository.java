package Project.DonationManagementSystem.Repository;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Project.DonationManagementSystem.model.Donar;

@Repository
public interface DonarRepository extends JpaRepository<Donar, Long>{
	
	
	@Query(value="select * from donar_table d where d.id in(select donar_id from Donation_Table where ngo_id=?1)",nativeQuery = true)
	public ArrayList<Donar> getDonarByNgo(long id);
}
