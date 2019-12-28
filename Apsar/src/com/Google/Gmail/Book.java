package com.Google.Gmail;

public class Book {
	
	public Book()
	{
		System.out.println("My product is book");
	}
	
	public Book(String name)
	{
		System.out.println(" name of the book is  "+"   "+name);
	}
	
	public Book(int cost , Float pages)
	{
		System.out.println("Cost of the Book is"+"    "+ cost +"   "+"Number of pages book contains"+"   "+pages);
	}
	
	public Book(String name , int cost , double indexes)
	{
		System.out.println("Colour of Book is"+"   "+name +"   "+"Type of Book is"+"    "+cost
				           +"   "+"Indexes present in a Book"+"    "+indexes);
		
	}
	
	public Book(String name , int pages , String type , float donation)
	{
		System.out.println("Name of the Book is"+"   "+name +"   "+"Pages in a Book"+"   "+pages 
				+"   "+"Type of the book is"+"   "+type +"   "+"donation from this Book"+"   "+ donation);
	}
	
public static void main(String[] args) {
	
	Book B = new Book();
	Book B1 = new Book("CLASSMATE");
	Book B2 = new Book(60 , 150.0f);
	Book B3 = new Book("CAMEl" , 70 , 4.0);
	Book B4 = new Book("APSARA" , 175 , "White" ,5);
	
}

}
