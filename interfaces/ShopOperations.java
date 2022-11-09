package interfaces;


import java.lang.*;
import classes.*;

public interface ShopOperations
{
	boolean insertShop(Shop s);
	boolean removeShop(Shop s);
	Shop searchShop(int sid);
	void showAllShop();
}