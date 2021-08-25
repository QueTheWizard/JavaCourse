package Tirgul8;

public class Student extends Person implements Learning, Living{

	public Student(String name) {
		super(name);
	}


	@Override
	public void live() {
		study();
		
	}
	
	public void study() {
		System.out.println(this + "is studying");
	}
	
	
	
	

}
