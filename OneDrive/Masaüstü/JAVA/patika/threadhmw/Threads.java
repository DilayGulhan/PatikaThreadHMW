package threadhmw;

import java.util.ArrayList;
import java.util.List;

public class Threads implements Runnable{

	private ArrayList<Integer> evenList = new ArrayList<Integer>();
	private ArrayList<Integer> oddList = new ArrayList<Integer>();

	private static List<Integer> subList = new ArrayList<Integer>();
	
	private final Object LOCK = new Object(); 
	
	
	
	public Threads(List<Integer> subList) {
		this.subList = subList;
	}
	


	
	

	@Override
	public void run() {
	

		synchronized(LOCK) {
		
				evenOdd(Threads.subList);
			
			
			}}
		

	
	public void evenOdd(List<Integer> arr) {
		for(int num : arr) {

			if(num%2 == 0) {
				evenList.add(num);
				System.out.println("The number " + num + "added in even list "  );
			}
			if(num%2 == 1) {
				oddList.add(num);
				System.out.println("The number " + num + "added in odd list "  );
			} 
			
		}
	}


	public ArrayList<Integer> getEvenList() {
		return evenList;
	}


	public ArrayList<Integer> getOddList() {
		return oddList;
	}

	

	}


