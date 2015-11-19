package hipster.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String [4];
		this.hipsterBooks = new Book [3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Eric Nylund");
		firstBook.setTitle("Halo: The fall of Reach");
		firstBook.setSubject("Science Fiction");
		firstBook.setPageCount(334);
		firstBook.setPrice(7.99);
	}
}
