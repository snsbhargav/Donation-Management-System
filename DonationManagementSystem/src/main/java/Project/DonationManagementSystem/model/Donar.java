package Project.DonationManagementSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity

@Table(name="Donar_Table")
public class Donar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Name")
	@NotNull
	@Size(min=3,max=100)
	private String name;
	
	@Column(name="Username")
	@NotNull
	@Size(min=3,max=50)
	private String username;
	
	@Column(name="Password")
	@NotNull
	@Size(min=3,max=50)
	private String password;
	
	@Column(name="Email")
	@NotNull
	@Email
	@Size(min=3,max=100)
	private String email;
	
	@Column(name="Phone",length = 10)
	@NotNull
	private long phone;
	
	@Column(name="Address")
	@NotNull
	@Size(min=3,max=100)
	private String address;
	
	public Donar() {}

	public Donar(@NotNull @Size(min = 3, max = 100) String name, @NotNull @Size(min = 3, max = 50) String username,
			@NotNull @Size(min = 3, max = 50) String password, @NotNull @Email @Size(min = 3, max = 100) String email,
			@NotNull @Size(min = 10, max = 10) int phone, @NotNull @Size(min = 3, max = 100) String address) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	
		
	
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Donar [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
