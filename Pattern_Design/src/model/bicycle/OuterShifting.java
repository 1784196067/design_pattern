package model.bicycle;

public class OuterShifting implements ShiftBehavior { //外变速

	@Override
	public void shift() {
		System.out.println("我采用的是外变速的变速方式。");
	}

}
