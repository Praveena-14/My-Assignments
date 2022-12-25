package week1.day1;

public class Mobile {
public void makeCall() {
	// TODO Auto-generated method stub
String mobileModel="Vivo Y24";
float mobileWeight=15.3f;
System.out.println(mobileModel);
System.out.println(mobileWeight);
}
public void sendMsg() {
	// TODO Auto-generated method stub
boolean FullCharged =true;
int mobileCost =15000;
System.out.println(FullCharged);
System.out.println(mobileCost);
}
public static void main(String[] args) {
	System.out.println("This is My Mobile");
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.sendMsg();
	
	
}
}

