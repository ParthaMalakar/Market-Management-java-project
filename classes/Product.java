package classes;

import java.lang.*;
import interfaces.*;

public abstract class Product implements IQuantity
{
    protected  int pid;

    protected  String name;

    protected  int availableQuantity;

    protected  double price;
  public Product()
	{
	System.out.println("empty");
    }
 public Product(  int pid, String name,int availableQuantity,double price)
     { 
      this.pid=pid;
      this.name=name;
      this.availableQuantity=availableQuantity;
      this.price=price;

     }

public void setPid(int pid) 
{
  this.pid=pid;
}

public void setName(String name)
{
  this.name=name;
}

public void setAvailableQuantity(int quantity) 
{
  availableQuantity=quantity;
}

public void setPrice(double price) {
  this.price=price;
}

public int getPid()
{
 return pid;
}
public String getName()
{
 return name;
}
public int getAvailableQuantity()
{
 return availableQuantity;
}
public double getPrice()
{
return price;
}
 public  boolean  addQuantity(int amount )
	   {
		if(amount>0 )
		    {
				availableQuantity+=amount;
				return true;
			}
			else
			   {
				 System.out.println("undeposit  balance");
                 return false;
			   }
	   }
  public   boolean  sellQuantity(int amount)
	      {
		
		   if( amount<availableQuantity&& amount>0)
		    {
			 availableQuantity-=amount;
			 return true;
		    }
		     else
			{
			 System.out.println("0  balance");
			 return false;
		  }
	}
	
    public abstract void showInfo();

}