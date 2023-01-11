package week3.day2;

public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	String test="changeme";
	char[] CharArray=test.toCharArray();
	for(int i=0;i<CharArray.length;i++) {
		if (i%2!=0) {
			CharArray[i]=Character.toUpperCase(CharArray[i]);
			System.out.println(CharArray[i]);
		}
	}
	
}}

