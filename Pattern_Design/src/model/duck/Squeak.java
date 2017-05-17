package model.duck;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我调用的是Squeak的quack方法，我的叫声是：吱、吱、吱、吱、吱、吱。。。。。。");
	}

}
