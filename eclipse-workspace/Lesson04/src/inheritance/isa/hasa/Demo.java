package inheritance.isa.hasa;

import inheritance.interview.Parent;

public class Demo extends Parent{

	public static void main(String[] args) {
		//strudent is - a person
		Person leteo=new Student();
		//student has-a grade
		Grade grade123=new Grade();
		Student lena=new Student();
		lena.setGrade(grade123);
		//demo protected definition
		Parent parent=new Parent();
		
	}
	
}
