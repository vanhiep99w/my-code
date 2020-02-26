package inheritance.superclass.sinterface;

public class StudentManagerImp implements StudentManager{

	@Override
	public boolean delete() {
		System.out.println("Deleting student");
		return false;
	}

	@Override
	public boolean add() {
		System.out.println("Adding student");
		return false;
	}

	
	
}
