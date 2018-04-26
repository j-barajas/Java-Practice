import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class LessonElevenArrayLists {
	
	public static void main(String[] args) {
		
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		//add method
		ArrayList<String> names = new ArrayList<>();
		names.add("John Smith");
		names.add("Jane Smith");
		names.add("Oliver Miller");
		
		//add to index
		names.add(2, "Jack Ryan");
		
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//replace item at index
		names.set(0, "John Adams");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//remove item from index
		names.remove(3);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		//print
		System.out.println(names);
		System.out.println("\n");
		
		//enhanced for loop
		for (String string : names) {
			System.out.print(string+" ");
		}
		
		System.out.println("\n");
		
		//iterator usage
		Iterator indivItems = names.iterator();
		while (indivItems.hasNext()) {
			System.out.print(indivItems.next()+" ");
		}
		
		System.out.println("\n");
		
		//copy method
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		//contains method
		String paulYoung = "Paul Young";
		
		names.add(paulYoung);
		
		if(names.contains(paulYoung)) {
			System.out.println("Paul is here");
		}
		if (names.containsAll(nameCopy)) {
			System.out.println("Everything in nameCopy is in names");
		}
		if(!nameCopy.containsAll(names)) {
			System.out.println("nameCopy does not contain everything in names");
		}
		
		System.out.println("\n");
		//clear
		names.clear();
		
		if(names.isEmpty()) {
			System.out.println("ArrayList is empty");
		}
		
		//ArrayList to array conversion
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		System.out.println(Arrays.toString(moreNames));
		
		
		
		
		
		
		
		
		
		
	}//end main	
}
