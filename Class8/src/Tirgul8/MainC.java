package Tirgul8;

import java.util.ArrayList;

public class MainC {
	
	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Worker("Avi", "Teacher"));
		people.add(new Student("Yossi"));
		people.add(new WorkingStudent("Moshe", "Waiter"));
		
		for(Person p:people) {
			p.live();
		}
		
		
	}

}
