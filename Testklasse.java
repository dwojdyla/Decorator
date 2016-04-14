
public class Testklasse {
public static void main(String[] args){
	Beverage beverage = new Espresso();
	System.out.println(beverage.getDescription() +" Und da noch der Preis für den Shit: "+ beverage.cost());
	
	Beverage beverage1 = new Decaf();
	System.out.println(beverage1.getDescription() +" Und da noch der Preis für den Shit: "+ beverage.cost());
}
}
