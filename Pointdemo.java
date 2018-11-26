package lab3new;

public class Pointdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Point Lucy = new Point();
Lucy.abscissa = 1.1;
Lucy.ordinate = 2.2;
Lucy.xchange = 0.1;
Lucy.ychange = 0.2;
Lucy.writeoutput();

double getnewx = Lucy.getnewx();
double getnewy = Lucy.getnewy() ;
System.out.println("修改后的原始坐标为："+"("+getnewx +"," +getnewy+")" );
	}

}
