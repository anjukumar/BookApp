
public class BookApp {

	public  static void main(String[] args) {
	Book a = new Book();
	a.setAuthorName("Anju");
	a.print(a.getAuthorName());
	a.setName("New Book");
	a.print(a.getName());
	a.setDescription("This is a fiction book");
	a.print(a.getDescription());
	a.setPrice("It costs $10");
	a.print(a.getPrice());
	a.setStock("It is out of stock");
	a.print(a.getStock());
		
	}

}
