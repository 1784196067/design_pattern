package model.duck;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我调用的是FlyNoWay的fly方法，我不能飞。");
	}

}
