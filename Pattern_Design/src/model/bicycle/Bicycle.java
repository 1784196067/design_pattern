package model.bicycle;

public abstract class Bicycle {
	public FoldBehavior foldBehavior; //折叠行为
	public ShiftBehavior shiftBehavior; //变速行为
	
	public void setFoldBehavior(FoldBehavior behavior){
		foldBehavior = behavior;
	}
	
	public void setShiftBehavior(ShiftBehavior behavior){
		shiftBehavior = behavior;
	}
	
	public void performFold() {
		foldBehavior.fold();
	}

	public void performShift() {
		shiftBehavior.shift();
	}
	
	public void wash(){
		System.out.println("我正在被清洗。");
	};
	
	public void repair(){
		System.out.println("我正在被修理。");
	};
	
	public abstract void ride();
	
}
