package week3.day2;

//import java.util.Iterator;

public class Palindrome {
public static void main(String[] args) {
    String str="madam";
    String rev="";
    int length=str.length();
    for (int i=length-1;i>=0;i--)
    {
    	rev=rev+str.charAt(i);
		
	}
    System.out.println(rev);
    if (str.equalsIgnoreCase(rev)) {
System.out.println("yes");		
	}
    else {
		System.out.println("No");
	}
    
}
}
