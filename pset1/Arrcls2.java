package lab;
import java.util.*;

public class Arrcls2 {

	static void display(int array[])
	{
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("");
	}
	public static void main(String args[])
	{
		int array2[]= {10,20,30};
		int array[] = new int[10];
		for(int i = 0; i < 10; i++)
			array[i] = -3 * i; 

		System.out.println("Original contents: ");
		display(array);
		Arrays.sort(array);  
		System.out.println("Sorted: ");
		display(array); 
 
		Arrays.fill(array, 2, 6+1, -1);
		System.out.println("After fill(): ");
		display(array);
		Arrays.sort(array);
		System.out.println("After sorting again: ");
		display(array);
		System.out.println("The value -6 is at location ");

		int index =Arrays.binarySearch(array, -9);
        System.out.println(index);
		System.out.println("2nd array is");
		display(array2);		
		if(Arrays.equals(array,array2))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");


	}
}
