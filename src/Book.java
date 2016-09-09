
public class Book 
{
	private String name; 
	private String title; 
	private String authorname;
	private String description;
	private double price;
	private boolean isInStock;

	public Book()
	{
		print("This is a new Book ");

	}

//	public Book(String name)
//	{
//		//this.name=name;
//		print("\n It is called" +name);
//
//	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title=title;
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
	public double getPrice()
	{
		return price;

	}
	public void setPrice(double price)
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
		System.out.print(x);
	}
	public String getDisplayText()
	{
		return(name + description+ String.valueOf(price));
		
	}
	
	
}
