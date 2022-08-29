package structural.composite2;

public class Officer extends Employee{

	public Officer(String name, String dept, int sal) {
		super(name, dept, sal);
	}
	
	public String toString(){
	    return "Officer" + super.toString();
	}
}	
