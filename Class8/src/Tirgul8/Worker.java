package Tirgul8;

public class Worker extends Person implements Living {
	private String profession; 

	public Worker(String name, String profession) {
		super(name);
		this.profession = profession;
	}
	
	public void work() {
		System.out.println(this + "is working");
	}
	
	public void live() {
		work();
	}
	

}
