package com.sonata.dayfive;

import java.util.ArrayList;
import java.util.List;

public class BookDAO 
{
	List<Book> Book = new ArrayList<>();
/*public List<Book>getBook()
{

/*Book.add(new Book(101,"Core Java",400));
Book.add(new Book(102,"Hibernate",400));
Book.add(new Book(103,"Sprnig",400));
Book.add(new Book(104,"React JS",400));

return Book;
}*/

public int getSize() 
{
	
	return Book.size();
	
	
}

public void add(Book element) 
{
	Book.add(element);
}

public void delete(int element)

{
	Book.remove(element);
}

public List<com.sonata.dayfive.Book> getBook() {
	// TODO Auto-generated method stub
	return null;
}

}



/*

package com.sonata.five;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
      List<Book> Book = new ArrayList<>();
      /*public List<Book>getBook()
{
            Book.add(new Book(101,"Core Java",400));
            Book.add(new Book(102,"Hibernate",300));
            Book.add(new Book(103,"Spring",200));
            Book.add(new Book(104,"ReactJS",300));
            return Book;
      }
      public void add(Book element) {
            Book.add(element);
      }
      
      public void delete(int element) {
            Book.remove(element);
      }
      int getSize()
      {
            return Book.size();
      }
}*/