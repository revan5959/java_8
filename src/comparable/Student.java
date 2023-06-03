package comparable;

public class Student implements Comparable<Student> {

	private int id;

	private String name;

	private String contact;

	private String email;

	public Student(int id, String name, String contact, String email) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Student o) {
		return  this.getName().compareTo(o.getName());
	}

}
