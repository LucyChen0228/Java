package lab3new;


public class Student {

	public String studentnumber;
	public int classnumber;
	public String studentname;
	public String studentsex;
	public int studentage;


public void outputstudentnumber()
{
	System.out.println("学生的学号是："+studentnumber);
}

public void outputclassnumber()
{
	System.out.println("学生的班号是："+classnumber);
	
}

public void outputstudentsex()
{
	System.out.println("学生的性别是："+studentsex);

}

public void outputstudentname()
{
	System.out.println("学生的名字是："+studentname);

}

public void outputstudentage()
{
	System.out.println("学生的年龄是："+studentage);

}

public String toString()
{
	String studentinformation;
	studentinformation =classnumber+studentnumber+studentsex+studentname+studentage;
	return studentinformation;
}


}