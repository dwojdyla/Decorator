
public class Soy extends CodnimentDecorator{
	Beverage beverage;
	public Soy (Beverage beverage){
		this.beverage=beverage;
	}
public double cost(){
		return 1.99;
	}
public String getDescription(){
	return "Servas oida das ist Soy";
	
}
}
