package classes;

import java.lang.*;
import interfaces.*;

public class  Shop implements ProductOperations
{

private String name;
private int sid;
private Product products[]= new Product[100];

public Shop(){

	System.out.println("empty");
}
public Shop( String name, int sid)
{
this.name=name;
this.sid=sid;

}
public void setName(String name)
{
this.name=name;
}
public void setSid(int sid)
{
this.sid=sid;

}
public String getName()
{
 return name;
}
public int getSid()
{
 return sid;
}
public boolean insertProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public void showAllProducts()
	{
		System.out.println("Product SID: "+sid);
		System.out.println("Product Name: "+name);
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				System.out.println("-------------------------");
				products[i].showInfo();
				System.out.println();
				
			}
		}
	}
	
	public  Product searchProduct(int pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid()== pid)
				{
					p = products[i];
					break;
				}
			}
		}
		return p;
	}
}

