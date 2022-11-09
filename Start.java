import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;


public class Start
{
	public static void main(String args[])
	{
		Market market = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in); 
		boolean repeat = true;
		
		System.out.println("---------------------------------------");
		System.out.println("Welcome to Noakhali Shopping Complex");
		System.out.println("---------------------------------------");
		
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop product Management");
			System.out.println("4. Product Quantity Add-sell");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Search an Employee");
					System.out.println("4. Show All Employees");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(market.insertEmployee(e1)){System.out.println("Employee Inserted..... ID: "+e1.getEmpId());}
							else{System.out.println("Oops.... Something is Wrong....");}
							
							System.out.println();
							break;
						
							
						case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an existing Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId3 = sc.next();
							
							Employee e3 = market.searchEmployee(empId3);
							
							if(e3 != null)
							{
								if(market.removeEmployee(e3)){System.out.println("Employee Removed.... ID: "+e3.getEmpId());}
								else{System.out.println("Oops.... Something is wrong...");}
							}
							else{System.out.println("No employee found to remove");}
							
							System.out.println();
							break;
						case 3:	
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							
							System.out.print("Enter EmpId: ");
							String empId2 = sc.next();
							
							Employee e2 = market.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee Found.......");
								System.out.println("Employee ID: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
								System.out.println();
							}
							else{System.out.println("No Such Employee Found....");}
								
							System.out.println();
							break;
							
							
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							
							market.showAllEmployees();
							
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				   case 2:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Shop Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Shop");
					System.out.println("2. Remove Existing Shop");
					System.out.println("3. Show all Shops");
					System.out.println("4. Scarch a Shop");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Shop");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							int sid = sc.nextInt();
							System.out.print("Enter Shop Name: ");
							String name = sc.next();
							
							Shop s1 = new Shop();
							s1.setSid(sid);
							s1.setName(name);
							
							if(market.insertShop(s1)){System.out.println("Shop Inserted..... SID: "+s1.getSid());}
							else{System.out.println("Oops..... Something is Worng....");}
							
							System.out.println();
							break;
							
					    case 2:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove an existing Shop");
							System.out.println("***********************************");
							System.out.print("Enter Shop SId: ");
							int  sid2 = sc.nextInt();
							
							Shop s3 = market.searchShop(sid2);
							
							if(s3 != null)
							{
								if(market.removeShop(s3)){System.out.println("Shop Removed.... SID: "+s3.getSid());}
								else{System.out.println("Oops.... Something is wrong...");}
							}
							else{System.out.println("No shop found to remove");}
							
							System.out.println();
							break;

							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Shop");
							System.out.println("***********************************");
							
							market.showAllShop();
							
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Shop");
							System.out.println("***********************************");
							
							System.out.print("Enter SId: ");
							int sid1 = sc.nextInt();
							
							Shop s2 = market.searchShop(sid1);
							
							if(s2 != null)
							{
								System.out.println("Shop Found.......");
								System.out.println("Shop SID: "+s2.getSid());
								System.out.println("Shop Name: "+s2.getName());
								System.out.println();
							}
							else{System.out.println("No Such Shop Found....");}
								
							System.out.println();
							break;
						
							
						
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;
					
				case 3:
				
					System.out.println("***********************************");
					System.out.println("Your Choice is: Shop product Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New product");
					
					System.out.println("2. Remove Existing Product");
					System.out.println("3. Show All product for a Shop");
					System.out.println("4. Search a product");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Product");
							System.out.println("***********************************");
							
							System.out.println("There are two Types of Products: ");
							System.out.println("1. Local product");
							System.out.println("2. Imported product");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							Product pcc = null;
							
							if(type == 1)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Local Product");
								System.out.println("***********************************");
								
								System.out.print("Enter Product PID: ");
								int an = sc.nextInt();
								System.out.print("Enter Product Name: ");
								String ahn = sc.next();
								System.out.print("Enter Available Quantity: ");
								int b = sc.nextInt();
								System.out.print("Enter Price: ");
								double p = sc.nextDouble();
								System.out.print("Enter Discount rate: ");
								double ir = sc.nextDouble();
								
								LocalProduct la = new LocalProduct(an, ahn, b,p, ir);
								
								pcc = la;
							}
							else if(type == 2)
							{
								System.out.println("***********************************");
								System.out.println("Your Type is: Imported Product");
								System.out.println("***********************************");
								
								System.out.print("Enter Product PID: ");
								int an = sc.nextInt();
								System.out.print("Enter Product Name: ");
								String ahn = sc.next();
								System.out.print("Enter Available Quantity: ");
								int b = sc.nextInt();
								System.out.print("Enter price: ");
								double P = sc.nextDouble();
								System.out.print("Enter country Name: ");
								String ty = sc.next();
								
								ImportedProduct fa = new ImportedProduct(an, ahn, b,P, ty);
								
								pcc = fa;
							}
							else if(type == 3)
							{
								System.out.println("***********************************");
								System.out.println("Going Back........");
								System.out.println("***********************************");
							}
							else
							{
								System.out.println("***********************************");
								System.out.println("Invalid Type........");
								System.out.println("***********************************");
							}
							
							if(pcc != null)
							{
								System.out.print("Enter Shop SID: ");
								int sid = sc.nextInt();
								
								Shop c = market.searchShop(sid);
								
								if( c != null)
								{
									if(c.insertProduct(pcc)){System.out.println("Product Inserted.... "+ pcc.getPid() + " for "+ c.getSid());}
									else{System.out.println("Oops.... Something is Wrong......");}
								}
								else{System.out.println("Oops.... Something is Wrong......");}
							}
							
							System.out.println();
							break;
				         case 2:
							System.out.println("***********************************");
							System.out.println("Your Option is:  Remove Existing Product");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							int sid11 = sc.nextInt();
							
							Shop c001 = market.searchShop(sid11);
							
							if(c001 != null)
							{
								System.out.print("Enter product pid: ");
								int an11 = sc.nextInt();
								
								Product pcc11 = c001.searchProduct(an11);
								
								if(pcc11 != null)
						            {if(c001.removeProduct(pcc11)){System.out.println("Product removed.... ");}
									else{System.out.println("Oops.... Something is Wrong......");}
									}
								}
								else{System.out.println("Oops.... NO shop found for remove product......");}
							break;
							/*System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Product");
							System.out.println("***********************************");
							System.out.print("Enter Shop SID: ");
								int sid = sc.nextInt();
								Product p = null;
								
								Shop c1 = market.searchShop(sid);
								
								if( c1 != null)
								{   
							        System.out.print("Enter Product PID: ");
								    int pid = sc.nextInt();
									Shop p1 =market.scarchProduct(pid);
									if( p1 != null)
									{
									if(c1.removeProduct(p1)){System.out.println("Product removed.... + pcc1.getPid() + for + c1.getSid()");}
									else{System.out.println("Oops.... Something is Wrong......");}
									}
								}
								else{System.out.println("Oops.... Something is Wrong......");}
							System.out.print("Enter Shop SId: ");
							int  sid = sc.nextInt();
							//Product m=pid;
							Shop p =  market.searchShop(sid);
                            Product m= null;
							
							if(p != null)
							{
								if(p.removeProduct(m)){System.out.println("Shop Removed.... PID: +pid.getPid()");}
								else{System.out.println("Oops.... Something is wrong...");}
							}
							else{System.out.println("No emplnoyee found to remove");}
							
							System.out.println();
							break;*/
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Products");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							int nid4 = sc.nextInt();
							
							Shop c4 = market.searchShop(nid4);
							
							if(c4 != null)
							{
								c4.showAllProducts();
							}
							else{System.out.println("Oops...... Something is Wrong.......");}
							
							System.out.println();
							break;
						
						case 4:
						System.out.println("***********************************");
							System.out.println("Your Option is: Such a product");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							int sid5 = sc.nextInt();
							
							Shop c02 = market.searchShop(sid5);
							
							if(c02 != null)
							{
								System.out.print("Enter product pid: ");
								int an5 = sc.nextInt();
								
								Product pcc8 = c02.searchProduct(an5);
								
								if(pcc8 != null)
								{
									System.out.print(" product  found: ");
									
								}
								
							}
							else{System.out.println("Oops....Noting found Something is Wrong......");}
							System.out.println();
							break;
						
						case 5:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
						
					}
					
					System.out.println();
					break;
				
				case 4:
				
					System.out.println("******************************************");
					System.out.println("Your Choice is: Product Quantity Add-Sel");
					System.out.println("******************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Add product");
					System.out.println("2. Sell product");
					System.out.println("3. Show Add sell history");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Add product");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							int sid1 = sc.nextInt();
							
							Shop c01 = market.searchShop(sid1);
							
							if(c01 != null)
							{
								System.out.print("Enter product pid: ");
								int an = sc.nextInt();
								
								Product pcc = c01.searchProduct(an);
								
								if(pcc != null)
								{
									System.out.print("Enter add product Quantity: ");
									int am = sc.nextInt();
									System.out.println("Current pRODUCT Quantity: " + pcc.getAvailableQuantity());
									if(pcc.addQuantity(am))
									{
										System.out.println("ADD product Quantity: "+ am + "     Successfull");
										System.out.println("New Quantity: "+pcc.getAvailableQuantity());
										frwd.writeInFile("ADD QUANTITY: "+am+" in "+ pcc.getPid());
										
									}
									else
									{
										System.out.println("Oops... Product not Found....");
									}
								}
								
							}
							
							System.out.println();
							break;
							
						case 2:
						System.out.println("***********************************");
							System.out.println("Your Option is: sell product");
							System.out.println("***********************************");
							
							System.out.print("Enter Shop SID: ");
							int sid2 = sc.nextInt();
							
							Shop c02 = market.searchShop(sid2);
							
							if(c02 != null)
							{
								System.out.print("Enter product pid: ");
								int an1 = sc.nextInt();
								
								Product pcc1 = c02.searchProduct(an1);
								
								if(pcc1 != null)
								{
									System.out.print("Enter sell product QUANTITY: ");
									int am1 = sc.nextInt();
									System.out.println("Current PRODUCT Quantity: " + pcc1.getAvailableQuantity());
									if(pcc1.sellQuantity(am1))
									{
										System.out.println("sell Amount: "+ am1 + "     Successfull");
										System.out.println("New Quantity: "+pcc1.getAvailableQuantity());
										frwd.writeInFile("sell QUANTITY: "+am1+" in "+pcc1.getPid());
										
									}
									else
									{
										System.out.println("Oops... Something is Wrong....");
									}
								}
								else
									{
										System.out.println("Oops... Shop not Found ....");
									}
							}
							
							
							System.out.println();
							break;
							
						case 3:
						
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Add -sell");
							System.out.println("***********************************");
							
							frwd.readFromFile();
							
							System.out.println();
							break;
							
						
						case 4:
						
							System.out.println("***********************************");
							System.out.println("Your Option is to Go Back.......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option......");
							System.out.println("***********************************");
							
							System.out.println();
							break;
					}
					
					System.out.println();
					break;
				
				case 5:
				
					repeat = false;
					System.out.println("******************************");
					System.out.println(" sir, we feel so blessed because you were our faculty in this semester."); 
					System.out.println("we've learned so many things ,without your help and support these were impossible.");
					System.out.println("thanks for being so supportive and friendly. ");
					System.out.println("******************************");
					
					System.out.println();
					break;
					
				default:
				
					System.out.println("******************************");
					System.out.println("Invalid Choice.....");
					System.out.println("******************************");
					
					System.out.println();
				break;
			}
		}
	}
}
