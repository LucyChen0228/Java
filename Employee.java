package lab5;

public class Employee {

 public int workingdays;
 public int daypayment;
 public int gudingsalary;
 public int moresalary;
 public int basicsalary;
 public int finalsalary;
}


class Manager extends Employee {
	
	Manager (int a){
	this.gudingsalary=a;
}
	public void display() {
		System.out.println("Manager的工资为：" + gudingsalary);
	}
}




class Salesman extends Employee{
	Salesman (int a,int b){
		this.basicsalary=a;
		this.moresalary=b;
		this.finalsalary= a+b;
	}
	
	public void display() {
		System.out.println("Salesman的工资为：" + finalsalary);
	}
}


class Worker extends Employee{
	Worker(int a, int b){
		this.workingdays=a;
		this.daypayment=b;
		this.finalsalary = a*b;
	}
	public void display() {
		System.out.println("Worker的工资为：" + finalsalary);
		
	}
}