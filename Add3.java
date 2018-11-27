package lab5;

interface Myface{
	  int getnext();
	  void setstart(int x);//自动会成为public void
	 }
//interface 是完全抽象的内容



public class Add3 implements Myface{
	int sta,val;
	  Add3(){
	     sta=0;val=0;
	  }
	  public int getnext(){//为什么会有两个不同的val值；一个有返回，一个没返回，
	    val+=3;
	    return val;
	  }
	  public void setstart(int i){
	    sta=i;
	    val=i;
	  }
	 }

//定义这个抽象的意义是什么？更好的使用getnext,setstart 吗？

