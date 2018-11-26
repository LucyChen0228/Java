package lab3new;

public class Point {
	
public double abscissa; //定义横坐标的值 
public double ordinate;//定义纵坐标的值
public double xchange; //横坐标的变化值
public double ychange;//纵坐标的变化值


public void writeoutput() {
	System.out.println("改点的原始坐标为："+"("+abscissa +"," +ordinate+")");

}

public double getnewx()
{
   
  double getnewx = abscissa - xchange;
  return getnewx;
}

public double getnewy()
{
	double getnewy = ordinate- ychange;
	return getnewy;
}

}
