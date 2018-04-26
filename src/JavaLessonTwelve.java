import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
public class JavaLessonTwelve {
	public static void main(String[] args) {
		
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Johnny Smith");
		names.add("Janey Smith");
		
		names.addLast("Nathan Martin");
		
		names.add(0,"Noah Peters");
		names.set(2, "Paul Newman");
		
		names.remove(3);
		names.remove("Janey Smith");
		

		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		System.out.println("\nFirst Index: "+names.get(0));
		System.out.println("\nLast Index: "+names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<>(names);
		
		System.out.println("\nnameCopy: "+nameCopy);
		
		if(names.contains("Noah Peters")) {
			System.out.println("\nNoahs Here");
		}
		
		if(names.containsAll(nameCopy)) {
			System.out.println("\nCollections the same");
		}
		
		System.out.println("\nPaul index at: "+names.indexOf("Paul Newman"));
		
		System.out.println("\nList empty: "+names.isEmpty());
		
		System.out.println("\nHow many: "+names.size());
		
		System.out.println("\nLook without error: "+names.peek());
		
		System.out.println("\nFirst element: "+nameCopy.poll());
		
		System.out.println("\nRemove last element: "+nameCopy.pollLast());
		
		nameCopy.push("Noah Peeters");
		
		System.out.println("\n");
		
		for (String name : nameCopy) {
			System.out.println(name);
		}
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		
		names.clear();
		
		
		
		
	}
}
