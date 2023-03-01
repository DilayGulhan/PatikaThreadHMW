package threadhmw;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class main {
	private static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
	  
	  for(int i = 0 ; i<=10000 ; i++) {
		  arr.add(i);
	  }
	  List<Integer> subarr1 =  arr.subList(0, 2500);
	  List<Integer> subarr2 =  arr.subList(2500,5000);
	  List<Integer> subarr3 =  arr.subList(5000, 7500);
	  List<Integer> subarr4 =  arr.subList(7500, 10000);
	  Threads thread = new Threads(subarr1);
	  Threads thread1 = new Threads(subarr2);
	  Threads thread2 = new Threads(subarr3);
	  Threads thread3 = new Threads(subarr4);

	  
	ExecutorService executor = Executors.newFixedThreadPool(15);

	
		executor.execute(thread);
		executor.execute(thread1);
		executor.execute(thread2);
		executor.execute(thread3);
		
		
		executor.shutdown();
		 try {
	            executor.awaitTermination(5, TimeUnit.SECONDS);
	        } catch (InterruptedException e) {
	            throw new RuntimeException(e);
	        }

	        System.out.print("Even Numbers : " );
	        System.out.print(thread.getEvenList().size()+thread1.getEvenList().size()+thread2.getEvenList().size()+thread3.getEvenList().size());


	
	

	}
	       

	   



	    

		
	

	}


