package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int el,rv=0,re;
	int num=34343;
	el=num;
	for (;num!=0;num/=10) {
		re=num%10;
		rv=(rv*10)+re;
	}
	if(el==rv) {
		System.out.println("Number is Palindrome");
	}
	else {
		System.out.println("Number is not Palindrome");
	}
}
}
