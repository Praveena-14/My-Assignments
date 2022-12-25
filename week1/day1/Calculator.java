package week1.day1;

public class Calculator {
	private void addone() {
		// TODO Auto-generated method stub
int a=5,b=5;
System.out.println(a+b);
	}
	private void addtwo() {
		// TODO Auto-generated method stub
int a=10,b=10,c=10;
System.out.println(a+b+c);
	}
	private void mulone() {
		// TODO Auto-generated method stub
int a=5,b=6;
System.out.println(a*b);
	}
	private void multwo() {
		// TODO Auto-generated method stub
int a=5;
double b=5.5d;
System.out.println(a*b);
	}
	public void subone() {
		// TODO Auto-generated method stub
int a=15,b=5;
System.out.println(a-b);
	}
	private void subtwo() {
		// TODO Auto-generated method stub
double a=25.5d,b=20.1d;
System.out.println(a-b);
	}
private void divone() {
	// TODO Auto-generated method stub
int a=10,b=5;
System.out.println(a/b);
}
private void divtwo() {
	// TODO Auto-generated method stub
int a=5;
double b=15.5;
System.out.println(a/b);
}
	public static void main(String[] args) {
		Calculator ca=new Calculator();
		ca.addone();
		ca.addtwo();
		ca.subone();
		ca.subtwo();
		ca.mulone();
		ca.multwo();
		ca.divone();
		ca.divtwo();
	
	}
}
