package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortListOfItems {

	public static void main(String[] args) {

		ArrayList<String> listItems = new ArrayList<>();

		listItems.add("Zen Laptop");
		listItems.add("Ball");
		listItems.add("Pen");
		listItems.add("Pencil");
		listItems.add("Rubber");
		listItems.add("Bat");

		Collections.sort(listItems);

		System.out.println(listItems);

	}

}
