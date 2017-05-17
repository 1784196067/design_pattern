package model.duck;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我调用的是FlyWithWings的fly方法，我用翅膀飞。");
	}

}
