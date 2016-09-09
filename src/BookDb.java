
public class BookDb 
{
	public Book getBook(String sku)
	{
		Book db = new Book();
		if(sku.equals("Java"))
		{
			db.setAuthorName("\n Kathy Sierra and Bert Bates");
			db.setDescription("\n Easy to read Java workbook");
			db.setPrice(47.50);
			db.setTitle("\n LOL");
		}
		if(sku.equals("Java 1002"))
		{
			db.setAuthorName("Bruce Eckel");
			db.setDescription("Details about Java under the hood");
			db.setPrice(20.00);
			db.setTitle("Thinking in Java");
		}
		if(sku.equals("Orcl1003"))
		{
			db.setAuthorName("Jeanne Boyarsky");
			db.setDescription("EEverything you need to know in one place");
			db.setPrice(45.00);
			db.setTitle("OCP: Oracle Certified Professional Java SE");
		}
		if(sku.equals("Python100"))
		{
			db.setAuthorName("Al Sweigart");
			db.setDescription("Fun with Python");
			db.setPrice(27.50);
			db.setTitle("Automate the Boring Stuff with Python");
		}
		return db;
		
		
	}
}