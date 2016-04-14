
public class Milk extends CodnimentDecorator{
	Beverage beverage;
	public Milk (Beverage beverage){
		this.beverage=beverage;
	}
	public double cost(){
		return 1.99;
	}
	public String getDescription(){
		return "servas oida das is Milch";
		
	}
}
