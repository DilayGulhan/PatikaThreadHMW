package SortingBooks;

import java.util.*;


public class main {

	public static void main(String[] args) {
		
		System.out.println("Putting in order by its name ");
		System.out.println(" ");
		System.out.println("**********************************");
		
		TreeSet<book> set1  = new TreeSet<>();
		set1.add(new book("Outliers", 244, "Malcolm Gladwell"));
		set1.add(new book("Art of War", 43, "Sun Tzu"));
		set1.add(new book("Pride and Prejudice", 380, "Jane Austen"));
		set1.add(new book("Art of Loving", 120, "Erich Froom"));
		set1.add(new book("DeepWork", 210, "Cal Newport"));
		for(book elem : set1 ) {
			System.out.println(elem.getName());
		}
	
		TreeSet<book> set2  = new TreeSet<>(new Comparator <book>() {

			@Override
			public int compare(book o1, book o2) {
				// TODO Auto-generated method stub
				return o1.getNumberOfPages() - o2.getNumberOfPages();
			}
			
		});
		System.out.println("Putting in order by its page number ");
		System.out.println(" ");
		System.out.println("**********************************");
		set2.addAll(set1);
		for(book elem : set2) {
			System.out.println(elem.getName());
		}
		
	}
	
}
