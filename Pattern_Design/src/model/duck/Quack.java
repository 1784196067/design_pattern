package model.duck;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我调用的是Quack的quack方法，我的叫声是：呱、呱、呱、呱、呱、呱。。。。。。");
	}

}
