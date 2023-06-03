package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortByStudentname {

	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Ravi", "8454545455", "ravi@gmail.com"));
		list.add(new Student(2, "Ganesh", "446545465646", "ganesh@gmail.com"));
		list.add(new Student(3, "Abhijeet", "8845454545", "abcabhijeet@gmail.com"));
		list.add(new Student(4, "Balaji", "1051515555", "balaji@gmail.com"));

		Collections.sort(list);
		
		for(Student s : list)
		System.out.println(s);
		
	}
}
