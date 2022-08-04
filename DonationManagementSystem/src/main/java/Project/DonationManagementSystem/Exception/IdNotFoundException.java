package Project.DonationManagementSystem.Exception;

public class IdNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IdNotFoundException() {
		super("The id you are looking is not in the database");
	}
	

}
