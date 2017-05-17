package model.bicycle;

public class OppositeFold implements FoldBehavior { //对折叠

	@Override
	public void fold() {
		System.out.println("我折叠的方式是对折叠。");
	}

}
