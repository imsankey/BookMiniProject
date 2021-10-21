package miniproject;

import java.util.Scanner;

public class BookTest 
{
	public static void main(String arg[])
	{
		Book book[]=new Book[10];
		int bookId,choice=0,count=0;
		String name,authorName,publisher;
		double price;
		Scanner sc=new Scanner(System.in);
		do {
		
		System.out.println("1.addbook \n2.Get all books \n3.update book byid \n4.delete book byid\n5.search book by id\n6. exit");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the book Id");
			bookId=sc.nextInt();
			
			System.out.println("Enter the book Name");
			name=sc.next();
			
			System.out.println("Enter the book author Name");
			authorName=sc.next();
			
			System.out.println("Enter the book Publishe name");
			publisher=sc.next();
			
			System.out.println("Enter the book price");
			price=sc.nextDouble();
			
			book[count]=new Book(bookId, name, authorName, publisher, price);
			count++;
			System.out.println("books added sucessfully");
			
			break;
		case 2:
			System.out.println("-----------------------books------------------------");
			for(int i=0;i<=count;i++)
			{
				System.out.println(book[i]);//book[1];
			}
			break;
			
		case 3:
			System.out.println("enter the existing bookid to update");
			bookId=sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(book[i]!=null && book[i].getBookId()==bookId)
				{
					System.out.println("Enter the new name to change");
					name=sc.next();
					book[i].setBookName(name);
					System.out.println("Enter the new new author to change");
					authorName=sc.next();
					book[i].setAuthorName(authorName);
					System.out.println("Enter the new publisher to change");
					publisher=sc.next();
					book[i].setBookPublisher(publisher);
					System.out.println("Enter the new price to change");
					price =sc.nextDouble();
					book[i].setBookPrice(price);
					
					System.out.println("book updated succesfully");
					
					
				}
			}
			break;
			
		case 4:
			
			System.out.println("enter the existing bookid to delete");
			bookId=sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(book[i]!=null && book[i].getBookId()==bookId)
				{
					book[i]=null;
					System.out.println("book deleted succesfully");
				}
			}
			break;
		case 5:
			
			System.out.println("enter the existing bookid to search");
			bookId=sc.nextInt();
			for(int i=0;i<count;i++)
			{
				if(book[i]!=null && book[i].getBookId()==bookId)
				{
					System.out.println(book[i]);
				}
			}
			break;
		case 6:
			System.out.println("thank you");
			System.exit(0);
			break;
			
		default :
			
			System.out.println("invalid choice");
			
			
			
		}
		
		
	}while(choice !=6);
	
	}

}
