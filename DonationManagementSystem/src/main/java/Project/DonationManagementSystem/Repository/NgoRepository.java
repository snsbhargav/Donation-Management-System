package Project.DonationManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Project.DonationManagementSystem.model.NGO;

@Repository
public interface NgoRepository extends JpaRepository<NGO, Long>{

}
