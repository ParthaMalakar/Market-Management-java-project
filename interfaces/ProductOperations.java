package interfaces;


import java.lang.*;
import classes.*;

public interface ProductOperations
{
public 	boolean insertProduct(Product p);
public	boolean removeProduct(Product p);
	
 Product searchProduct(int pid);
void showAllProducts();
}