package thulasi;
import java.util.Date;
import java.util.GregorianCalendar;

class Movie
{
	private int productid;
	private String   ProductName;
	private Date DateOfManufacture;
	private double price;
	public void setProductId(int pid)
	{
		this.productid=pid;
	}
	public void setProductName(String pname)
	{
		this.ProductName=pname;
	}
	public void setDateOfManufacture(Date dom)
	{
		this.DateOfManufacture=dom;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	int getProductId()
	{
		return this.productid;
	}
	String getProductName()
	{
		return this.ProductName;
	}
	Date getDateOfManufacture()
	{
		return this.DateOfManufacture;
	}
	double getPrice()
	{
		return this.price;
	}
}
class MovieDemo 
{
	public static void main(String[] args) 
	{
		Movie m1=new Movie();
		GregorianCalendar gc=new GregorianCalendar(2020,2,8);
		Date d1=gc.getTime();
		m1.setProductId(101);
		m1.setProductName("KGF Chapter1");
		m1.setDateOfManufacture(d1);
		m1.setPrice(230);
		Movie m2=new Movie();
		gc=new GregorianCalendar(2020,2,8);
		Date d2=gc.getTime();
		m2.setProductId(120);
		m2.setProductName("BIGIL");
		m2.setDateOfManufacture(d2);
		m2.setPrice(120);
		Movie m3=new Movie();
		gc=new GregorianCalendar(2017,9,04);
		Date d3=gc.getTime();
		m3.setProductId(126);
		m3.setProductName("ASuran");
		m3.setDateOfManufacture(d3);
		m3.setPrice(230);
		System.out.println("ProductID:"+m1.getProductId()+"\tProductName:"+m1.getProductName()
				+"\tDateOfManufacture:"+m1.getDateOfManufacture()+"\tPrice:"+m1.getPrice());
		System.out.println("ProductID:"+m2.getProductId()+"\tProductName:"+m2.getProductName()
				+"\t\t\tDateOfManufacture:"+m2.getDateOfManufacture()+"\tPrice:"+m2.getPrice());
		System.out.println("ProductID:"+m3.getProductId()+"\tProductName:"+m3.getProductName()
						+"\t\tDateOfManufacture:"+m3.getDateOfManufacture()+"\tPrice:"+m3.getPrice());
	}

}

