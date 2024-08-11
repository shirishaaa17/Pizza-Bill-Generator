package Bill;

public class Deluxe extends Pizza {
	public Deluxe(boolean veg) {
		super(veg);
		if(veg) {
		this.price=550;}else {
		this.price=650;}
	}
}