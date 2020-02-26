package inheritance.java08;

public class MultipleInhertance implements Interface01,Interface02{

	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		Interface01.super.log(log);
		Interface02.super.log(log);
	}

}
