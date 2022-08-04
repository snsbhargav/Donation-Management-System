package Project.DonationManagementSystem.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Donation_Table")
public class Donation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="donation_type")
	@NotNull
	@Size(min=3,max=100)
	private String donationType;
	
	@Column(name="amount")
	@NotNull
	private int amount;
	
	@Column(name="donation_date")
	@NotNull
	@Future
	private Date donationDate;
	
//	@Column(name="donar_id")
//	@NotNull
	@OneToOne(cascade = CascadeType.REMOVE,orphanRemoval = true)
	@JoinColumn(name="donar_id")
	private Donar donarId;
	
	@Column(name="ngo_id")
	@NotNull
	private long ngoId;

	public Donation() {}
	
	

	public Donation(@NotNull @Size(min = 3, max = 100) String donationType, @NotNull int amount,
			@NotNull @Future Date donationDate, @NotNull Donar donarId, @NotNull long ngoId) {
		super();
//		this.id = id;
		this.donationType = donationType;
		this.amount = amount;
		this.donationDate = donationDate;
		this.donarId = donarId;
		this.ngoId = ngoId;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDonationType() {
		return donationType;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	

	public Donar getDonarId() {
		return donarId;
	}



	public void setDonarId(Donar donarId) {
		this.donarId = donarId;
	}



	public long getNgoId() {
		return ngoId;
	}

	public void setNgoId(long ngoId) {
		this.ngoId = ngoId;
	}

	@Override
	public String toString() {
		return "Donation [id=" + id + ", donationType=" + donationType + ", amount=" + amount + ", donationDate="
				+ donationDate + ", donarId=" + donarId + ", ngoId=" + ngoId + "]";
	}
	
	
	
}
