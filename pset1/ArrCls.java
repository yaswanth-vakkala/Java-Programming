package lab;
import java.util.*;

public class ArrCls {
	
	static void display(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int arr1[] = {5,3,2,1,33,101,64};
		int arr2[] = {100,300,200,250};
		System.out.println("original array:");
		display(arr1);
		Arrays.sort(arr1);
		System.out.println("sorted array:");
		display(arr1);
		Arrays.fill(arr1,2,5,-2);
		System.out.println("After fill():");
		display(arr1);
		Arrays.sort(arr1);
		System.out.println("After sorting again");
		display(arr1);
		System.out.println("index of element 2 is "+Arrays.binarySearch(arr1, 2));
		System.out.println("2nd array is: ");
		display(arr2);
		boolean b = Arrays.equals(arr1, arr2);
		System.out.println("both are equal is "+b);
	}

}
