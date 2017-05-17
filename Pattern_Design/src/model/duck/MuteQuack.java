package model.duck;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我调用的是MuteQuack的quack方法，我没有叫声");
	}

}
