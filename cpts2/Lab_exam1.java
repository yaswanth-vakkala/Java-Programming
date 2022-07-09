package cls_java;
import java.util.*;

public class Lab_exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,2},{3,2,4},{5,2,1}};
		int b[][] = {{2,1,5},{2,3,3},{1,3,4}};
		int c[][] = new int[3][3];
//		for(int i=0; i<3;i++) {
//			for(int j=0;j<3;j++)
//				c[i][j] = a[i][j]+b[i][j];
//		}
//		for(int k=0;k<3;k++)
//			for(int l=0;l<3;l++)
//				System.out.println(c[k][l]);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				c[i][j] = 0;
				for(int k=0;k<3;k++) {
					c[i][j] = c[i][j]+a[i][k]*b[k][j];
				}
	
			}
		for(int k=0;k<3;k++)
			for(int l=0;l<3;l++)
				System.out.println(c[k][l]);
	}
	

}
