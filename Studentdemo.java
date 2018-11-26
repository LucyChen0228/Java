package lab3new;


public class Studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Yezhou = new Student();
		Yezhou.classnumber = 1;
		Yezhou.studentage = 20;
		Yezhou.studentname = "陈叶舟";
		Yezhou.studentnumber = "222016601105035";
		Yezhou.studentsex="女";
		Yezhou.outputclassnumber();
		Yezhou.outputstudentage();
		Yezhou.outputstudentname();
		Yezhou.outputstudentnumber();
		Yezhou.outputstudentsex();
		
		
		String information = Yezhou.toString();
		System.out.println("学生的信息汇总："+ information);
	}

}
