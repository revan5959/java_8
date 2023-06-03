package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HelperClass implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		//return (int) (o1.getAdhaarId() - o2.getAdhaarId());
		
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}
	
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person( "Revan", "Siddu", 97875887));
		list.add(new Person( "Vinod", "ambur", 14555554));
		list.add(new Person( "Deepak", "garu", 52477889));
		list.add(new Person( "Arun", "karan", 25478899));
		list.add(new Person( "Bhavani", "patil", 10045588));
		
		Collections.sort(list, new HelperClass());
		
		for( Person p : list)
			System.out.println(p);
		
		Comparator comp = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				
				return o1.getLastName().compareToIgnoreCase(o2.getLastName());
			}
		};
		
							// OR
		System.out.println("------------implementing annonymous class");
		Collections.sort(list, comp);
		
		for( Person pp : list)
			System.out.println(pp);
		
	}
	
	


	
}
