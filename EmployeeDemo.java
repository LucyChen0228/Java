package lab5;

public class EmployeeDemo {

	public static void main(String[] args) {
	
		Manager s1 = new Manager(20000);
	    s1.display();
	    
	    
	    Salesman s2 = new Salesman(7000,3000);
	    s2.display();
	    
	    
	    Worker s3 = new Worker(300,21);
	    s3.display();
	    
	    
	}
}
