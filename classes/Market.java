package classes;
import java.lang.*;
import interfaces.*;

public class Market implements ShopOperations, EmployeeOperations
{
	Shop shop[] = new Shop[1000];
	Employee employees[] = new Employee[100];
	
	public boolean insertShop(Shop s)
	{
		boolean flag = false;
		for(int i=0; i<shop.length; i++)
		{
			if(shop[i] == null)
			{
				shop[i] = s;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeShop(Shop s)
	{
		  boolean flag = false;
		for(int i=0; i<shop.length; i++)
		{
			if(shop[i] == s)
			{
				shop[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public void showAllShop()
	{
		for(int i=0; i<shop.length; i++)
		{
			if(shop[i] != null)
			{
				System.out.println("-------------------------");
				shop[i].showAllProducts();
				System.out.println();
				
			}
		}
	}
	
	public Shop searchShop(int sid)
	{
		Shop s = null;
		
		for(int i=0; i<shop.length; i++)
		{
			if(shop[i] != null)
			{
				if(shop[i].getSid() == sid)
				{
					s = shop[i];
					break;
				}
			}
		}
		return s;
	}
	
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("-------------------------");
				System.out.println("Employee Id: "+employees[i].getEmpId());
				System.out.println("Employee Name: "+employees[i].getName());
				System.out.println("Employee Salary: "+employees[i].getSalary());
				System.out.println();
				
			}
		}
	}
	
	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
}