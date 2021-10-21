package miniproject;

public class Book 
{
	private int bookId;
	private String bookName,authorName,bookPublisher;
	private double bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId=bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	Book(int bookId,String bookName,String authorName,String bookPublisher,double bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPublisher=bookPublisher;
		this.bookPrice=bookPrice;
		
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId +",bookName=" + bookName + ", authorName=" + authorName + ", bookPublisher=" + bookPublisher
				+ ", bookPrice=" + bookPrice + "]";
	}
	
	

}
