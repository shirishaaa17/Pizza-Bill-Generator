package Bill;
import java.util.*;

public class Mainproject{
	int total=0;

	public static void main(String[] args) {
		System.out.println("<-------------------------------------------------WELCOME TO PIZZAMANIA-------------------------------------------------------->\n");
		System.out.println("Which pizza? : (1.Veg Pizza 2.Non-veg Pizza 3.Deluxe veg pizza 4.Deluxe non veg pizza)");
   
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch){
		case 1:
			Pizza vegPizza=new Pizza(true);
			vegPizza.addExtraToppings();
			vegPizza.addExtraCheese();
			vegPizza.takeaway();
			vegPizza.getBill();
			break;
		case 2:
			Pizza nonvegPizza=new Pizza(false);
			nonvegPizza.addExtraToppings();
			nonvegPizza.addExtraCheese();
			nonvegPizza.takeaway();
			nonvegPizza.getBill();
			break;
		case 3:
			Deluxe veg= new Deluxe(true);
			veg.basepizzaPrice=550;
			veg.takeaway();
			veg.getBill();
			break;
		case 4:
			Deluxe nonveg=new Deluxe(false);
			nonveg.basepizzaPrice=650;
			nonveg.takeaway();
			nonveg.getBill();
			break;
		default:
			System.out.println("Invalid Option. Try again!");
		}
		sc.close();
		
	}

}
