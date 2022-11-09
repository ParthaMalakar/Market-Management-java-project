package classes;
import java.lang.*;


public class LocalProduct extends Product
{

private double discountRate;
 
public LocalProduct()
    {
 	System.out.println("Empty");
    }
 public LocalProduct(int pid, String name,int availableQuantity,double price,double discountRate)
 {
	 super(pid,name,availableQuantity,price);
this.discountRate=discountRate;
 }


public void setDiscountRate(double discountRate)
{
     this.discountRate=discountRate;
}
public double getDiscountRate()
{
 return discountRate;
}
public void showInfo()
	{
		System.out.println("PID Number: "+pid);
		System.out.println(" Name: "+name);
		System.out.println("AVailable Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Discunt Rate: "+discountRate);
	}

}