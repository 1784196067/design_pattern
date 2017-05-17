package model.duck;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我调用的是FlyWithRocket的fly方法，我在火箭的帮助下飞。");
	}

}
