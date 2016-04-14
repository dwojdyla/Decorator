
public class Mocha extends CodnimentDecorator{
	Beverage beverage;
	public Mocha (Beverage beverage){
		this.beverage=beverage;
	}


public double cost(){
		return 1.99;
	}
public String getDescription(){
	return "Servas oida das ist Mocha";
	
}
}
