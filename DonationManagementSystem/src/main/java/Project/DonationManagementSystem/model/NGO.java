package Project.DonationManagementSystem.model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="NGO_Table")
public class NGO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ngoId;
	
	@Column(name="NGO_name")
	@NotNull
	@Size(min=3,max=100)
	private String ngoName;
	
	@NotNull
	@Size(min=3,max=50)
	@Column(name="username")
	private String username;
	
	@NotNull
	@Size(min=3,max=50)
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	@NotNull
	@Size(min=3,max=100)
	private String address;
	
	@Column(name="phone")
	@NotNull
	private long phone_no;
	
	@Column(name="Started_on")
	@NotNull
	@Past
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date ngoStartedIn;
	
	@Column(name="ngo_documents")
	@NotNull
	@Size(min=3,max=100)
	private String ngoDocuments;

	public NGO() {}
	
	public void setNgoId(long ngoId) {
		this.ngoId = ngoId;
	}

	public NGO(String ngoName, String username, String password, String address, int phone_no, Date ngoStartedIn,
			String ngoDocuments) {
		super();
		this.ngoName = ngoName;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone_no = phone_no;
		this.ngoStartedIn = ngoStartedIn;
		this.ngoDocuments = ngoDocuments;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public Date getNgoStartedIn() {
		return ngoStartedIn;
	}

	public void setNgoStartedIn(Date ngoStartedIn) {
		this.ngoStartedIn = ngoStartedIn;
	}

	public String getNgoDocuments() {
		return ngoDocuments;
	}

	public void setNgoDocuments(String ngoDocuments) {
		this.ngoDocuments = ngoDocuments;
	}

	public long getNgoId() {
		return ngoId;
	}

	@Override
	public String toString() {
		return "NGO [ngoId=" + ngoId + ", ngoName=" + ngoName + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", phone_no=" + phone_no + ", ngoStartedIn=" + ngoStartedIn
				+ ", ngoDocuments=" + ngoDocuments + "]";
	}
	
	
	
}
