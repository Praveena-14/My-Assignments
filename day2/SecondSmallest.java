package week1.day2;

import java.util.Arrays;

public class SecondSmallest {
public static void main(String[] args) {
	int a[]= {23,45,67,32,89,22};
	Arrays.sort(a);
	int small=a[1];
	System.out.println("The second smallest number is"+small);
}
}
