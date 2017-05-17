package model.bicycle;

public class NoFold implements FoldBehavior {

	@Override
	public void fold() {
		System.out.println("我不能折叠。");
	}

}
