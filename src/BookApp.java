import java.util.Scanner;

public class BookApp {

	public  static void main(String[] args) {
	//Book a = new Book();
	
	double amt=0;
	System.out.println("\n Enter an SKU:  ");
	Scanner sc = new Scanner(System.in);
	String sku=sc.nextLine();
	
	
	BookDb db1 = new BookDb();
	Book bookApp = db1.getBook(sku);
//	if(bookApp.getStock()==true)
//	{
//		amt= amt + bookApp.getPrice();
//		
//	}	
	System.out.print(bookApp.getDisplayText());
	sc.close();
	
	}

}
