package model.bicycle;

public class InnerShifting implements ShiftBehavior { //后轴头内变速

	@Override
	public void shift() {
		System.out.println("我采用的是后轴头内变速的变速方式。");
	}

}
