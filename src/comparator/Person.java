package comparator;

public class Person {

	private String firstName;
	
	private String lastName;

	private long adhaarId;
	
	public Person(String firstName, String lastName, long adhaarId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.adhaarId = adhaarId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAdhaarId() {
		return adhaarId;
	}

	public void setAdhaarId(long adhaarId) {
		this.adhaarId = adhaarId;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", adhaarId=" + adhaarId + "]";
	}

	
	
}
