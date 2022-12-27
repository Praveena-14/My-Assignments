package week1.day2;

public class NegativeToPositive {
public static void main(String[] args) {
	int number= -40;
	if (number<0) {
		int x=number;
		int y=x+(2*(-1*x));
		System.out.println("The number"+ number+" is converted to "+y);
	}
	else {
		System.out.println(number+" It is already a Positive number");
	}
}
}
