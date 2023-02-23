package SortingBooks;


public class book implements Comparable<book> {

	
	private String name ; 
	private int numberOfPages ;
	private String author;
	
	
	public book(String name , int numberOfPages , String author) {
		this.name = name; 
		this.numberOfPages = numberOfPages;
		this.setAuthor(author); 
	}
	

	@Override
	public int compareTo(book o) {
		
		return name.compareTo(o.getName());
	}
	
	/*
	@Override
	public int compareTo(book  book1 ) {
	    int i = this.name.compareTo(book1.getName());
	    if(i != 0) return -i;  // reverse sort

	    return this.name.compareTo(book1.getName());
	}
	*/
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

}