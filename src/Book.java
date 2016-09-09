
public class Book 
{
	private String name; 
	private String authorname;
	private String description;
	private String price;
	private boolean isInStock;

	public Book()
	{
		print("This is a new Book");
		
	}
	
	public Book(String name)
	{
		this.name=name;
		print("\n It is called" +name);
		
	}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getAuthorName()
	{
		return authorname;
	
	}
	public void setAuthorName(String authorname)
	{
		this.authorname=authorname;
	}
	public String getDescription()
	{
		return description;
	
	}
	public void setDescription(String description)
	{
		this.description=description;
	}	
	public String getPrice()
	{
		return price;
	
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public boolean getStock()
	{
		return isInStock;
	
	}
	public void setStock(boolean isInStock)
	{
		this.isInStock=isInStock;
	}
	public void print( String x)
	{
		System.out.println(x);
	}
	public void getDisplayText()
	{
		print(name);
		print(description);
		print(price);
		print(isInStock);
	}	
}
