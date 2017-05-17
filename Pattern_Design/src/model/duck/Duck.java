package model.duck;

public abstract class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;

	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}
	
	public void setFlyBehavior(FlyBehavior behavior){
		this.flyBehavior = behavior;
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim(){
		System.out.println("我正在游泳。");
	};
	
	public abstract void display();
	
	

}
