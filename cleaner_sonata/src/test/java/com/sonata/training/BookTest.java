package com.sonata.training;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;




import com.sonata.dayfive.Book;
import com.sonata.dayfive.BookDAO;

public class BookTest 
{
	BookDAO b = new BookDAO();
	
	
	@Test
	public void testAdd() 
	{
		b.add(new Book(101,"Book 1",100));
		b.add(new Book(102,"Book 2",200));
		b.add(new Book(103,"Book 3",300));
		b.add(new Book(104,"Book 4",400));
		b.add(new Book(105,"Book 5",500));
		int size = b.getSize();
		System.out.println(size);
		assertEquals(5, size);
}
	
	
	@Test
	public void testdelete()
{
	b.add(new Book(101,"Book 1",100));
	b.add(new Book(102,"Book 2",200));
	b.add(new Book(103,"Book 3",300));
	b.add(new Book(104,"Book 4",400));
	b.add(new Book(105,"Book 5",500));
	b.delete(1);
	int Size = b.getSize();
	System.out.println(Size);
	assertEquals(4, Size);
}
		
}

/*
package com.sonata.five;

import static org.junit.Assert.*;
import org.junit.Test;

public class BooksTest {
BookDAO b = new BookDAO();
      @Test
      public void testAdd() {
            b.add(new Book(101,"Book 1",100));
            b.add(new Book(102,"Book 2",200));
            b.add(new Book(103,"Book 3",300));
            b.add(new Book(104,"Book 4",400));
            b.add(new Book(105,"Book 5",500));
            int Size = b.getSize();
            System.out.println(Size);
            assertEquals(5, Size);
      }
      @Test
      public void testdelete() {
            b.add(new Book(101,"Book 1",100));
            b.add(new Book(102,"Book 2",200));
            b.add(new Book(103,"Book 3",300));
            b.add(new Book(104,"Book 4",400));
            b.add(new Book(105,"Book 5",500));
            b.delete(1);
            int Size = b.getSize();
            System.out.println(Size);
            assertEquals(4, Size);
      }
}


*/