package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,7,6,8 };
        Arrays.sort(arr);
        int N = arr.length;
        System.out.println(MissingNo(arr, N));
    }
	public static int MissingNo(int nums[], int n)
    {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }
}