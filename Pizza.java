package Bill;
import java.util.*;

public class Pizza {
	protected int price;
	private Boolean veg;
	protected int basepizzaPrice;
	
	protected int extraToppingsPrice=150;
	protected int extraCheesePrice=100;
	protected int takeawayPrice=20;
	
    protected boolean isExtraToppingsAdded=false;
    protected boolean isExtraCheeseAdded=false;
    protected boolean isOptedForTakeaway=false;
    
    Scanner sc=new Scanner(System.in);
    
    public Pizza(Boolean veg){
    	this.veg=veg;
    	
    	if(this.veg){
    		this.price=300;
    	}else {
    		this.price=400;
    	}
    	
    	basepizzaPrice=this.price;
    }
    
        public void addExtraToppings()
        {
        	System.out.println("Want extra topping(y/n)?");
    		char choice=sc.next().charAt(0);
    		
    		switch(choice){
    		case 'y':
    		case 'Y':
    			isExtraToppingsAdded=true;
    			this.price+=extraToppingsPrice;
    			break;
    		case 'n':
    		case 'N':	
    			isExtraToppingsAdded=false;
    		    break;
    		default:
    			System.out.println("Invalid option! Try again.");
    			addExtraToppings();
    			break;
    		}
        }
        
        public void addExtraCheese(){
        	System.out.println("Want extra cheese(y/n)?");
    		char choice=sc.next().charAt(0);
    		switch(choice) {
    		case('y'):
    		case('Y'):	
       			this.price+=extraCheesePrice;
    			isExtraCheeseAdded=true;
    			break;
    		case('n'):
    		case('N'):	
    			isExtraCheeseAdded=false;
    		    break;
    		default:
    			System.out.println("Invalid option. Try again.");
    			addExtraCheese();
    			break;
    		}
    		}  
        
        public void takeaway() {
        	System.out.println("Want takeaway(y/n)?");
    		char choice=sc.next().charAt(0);
    		switch(choice){
    		case('y'):
    		case('Y'):	
    			this.price+=takeawayPrice;
    			isOptedForTakeaway=true;
    			break;
    		case('n'):
    		case('N'):	
    			isOptedForTakeaway=false;
    		    break;
    		default:
    			System.out.println("Invalid option! Try again.");
    			takeaway();
    			break;
    		}
        }
        
        public void getBill(){
        	String bill="";
            System.out.println("Pizza         : "+basepizzaPrice);
        	if(isExtraToppingsAdded)
        	{
        	bill+="Extra Toppings: "+extraToppingsPrice+"\n";
        	}
        	
        	if(isExtraCheeseAdded){
        	bill+="Extra Cheese  : "+extraCheesePrice+"\n";
        	}
        	
        	if(isOptedForTakeaway){
        	bill+="Takeaway      : "+takeawayPrice+"\n\n";
        	}
        	
        	bill+="TOTAL BILL    : "+this.price+"\n";
        	System.out.println(bill);
        	System.out.println("THANK YOU!!! VISIT AGAIN....");
        	System.out.println("<------------------------------------------------------------------------------------------------------------------------------------------------>");
        	
        
   
    }

}
