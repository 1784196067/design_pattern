package model.bicycle;

public class NoShifting implements ShiftBehavior { //不可变速

	@Override
	public void shift() {
		System.out.println("我不可变速。");
	}

}
