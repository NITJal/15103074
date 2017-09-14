
import java.util.Scanner;

/**
*     <h1>MATRIX MULTIPLICATION  </h1>
*     <p1>MULtiply 2*2 matrix</p1>
*     @version :0.1
*   @author :xyz
*    @since :22/08/17
*/

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for array A: ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				x=sc.nextInt();
				a[i][j]=x;
			}
		}
		System.out.println("Enter the values for array B: ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				x=sc.nextInt();
				b[i][j]=x;
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Values of Array C:");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
