package test;


import model.bicycle.Bicycle;
import model.bicycle.InnerShifting;
import model.bicycle.MtbBicycle;
import model.bicycle.OppositeFold;
import model.duck.Duck;
import model.duck.MallardDuck;
import model.duck.Squeak;

public class Test {

	@org.junit.Test
	public void duckSimulator() {
		Duck mallard = new MallardDuck();
	    mallard.setQuackBehavior(new Squeak());
	    mallard.performQuack();
	    mallard.display();
	    mallard.swim();
	}
	
	@org.junit.Test
	public void bicycleSimulator() {
		Bicycle bicycle = new MtbBicycle();
		bicycle.setFoldBehavior(new OppositeFold());
		bicycle.performFold();
		bicycle.setShiftBehavior(new InnerShifting());
		bicycle.performShift();
		bicycle.wash();
	}

}
