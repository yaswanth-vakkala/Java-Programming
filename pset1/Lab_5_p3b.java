package lab;

import java.util.Scanner;

public class Lab_5_p3b {

	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int n = i - 1; n >= 1; n--)
            {
                System.out.print(n);
            }
            System.out.println();
        }
        int row=5, i=1, j=1;
        do {
        	System.out.println("\n");
        	i++;
        	j=1;
        	do {
        		System.out.println("*");
        		j++;
        	}while(j<=row);
        }while(i<=row);
	}

}
