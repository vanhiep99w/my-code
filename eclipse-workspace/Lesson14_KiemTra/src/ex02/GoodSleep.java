package ex02;

public enum GoodSleep {

	TSS(1,3,20),TMS(4,13,11),TTN(14,17,9),TNorNTT(18,64,8),NLT(65,65,7);
	private GoodSleep(int start, int end, int timeOfGoodSleep) {
		this.start = start;
		this.end = end;
		this.timeOfGoodSleep = timeOfGoodSleep;
	}
	private int start;
	private int end;
	private int timeOfGoodSleep;
	private GoodSleep() {
		// TODO Auto-generated constructor stub
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getTimeOfGoodSleep() {
		return timeOfGoodSleep;
	}
	public void setTimeOfGoodSleep(int timeOfGoodSleep) {
		this.timeOfGoodSleep = timeOfGoodSleep;
	}
}
