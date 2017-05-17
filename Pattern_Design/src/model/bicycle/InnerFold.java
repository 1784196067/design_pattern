package model.bicycle;

public class InnerFold implements FoldBehavior { //内折叠

	@Override
	public void fold() {
		System.out.println("我折叠的方式是内折叠。");
	}

}
