package Tirgul8;

public class WorkingStudent extends Worker implements Learning, Living {

	public WorkingStudent(String name, String profession) {
		super(name, profession);
	}

	@Override
	public void study() {
		System.out.println(this + "is studying");
		
	}
	
	public void live() {
		work();
		study();
	}

}
