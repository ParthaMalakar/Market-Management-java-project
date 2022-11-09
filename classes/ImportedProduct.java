package classes;
import java.lang.*;


public class ImportedProduct extends Product
{

private String countryName;

 
 public ImportedProduct()
 {

 	System.out.println("Empty");
 }
 public ImportedProduct(int pid, String name,int availableQuantity,double price,String countryName)
 {
	 super(pid,name,availableQuantity,price);
     this.countryName=countryName;
 }


public void setCountryName(String countryName)
{

this.countryName=countryName;
}
public String getCountryName()
{
 return countryName;
}
public void showInfo()
	{
		System.out.println("PID Number: "+pid);
		System.out.println(" Name: "+name);
		System.out.println("AVailable Quantity: "+availableQuantity);
		System.out.println("Price: "+price);
		System.out.println("Country Name: "+countryName);
	}


}