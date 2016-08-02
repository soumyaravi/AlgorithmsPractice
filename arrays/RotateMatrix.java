package arrays;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		}
		rotate(a,n);
	}

	private static void rotate(int[][] a, int n) {
		// rotate matrix by 90 degrees
		for(int layer = 0;layer<n/2;layer++){
			int first = layer;
			int last = n-1-layer;
			
			for(int i=first;i<last;i++){
				int offset = i-first;
				int top = a[first][i];
				
				//left -> top
				a[first][i] = a[last-offset][first];
				
				// bottom -> left
				a[last-offset][first] = a[last][last-offset];
				
				//right -> bottom
				a[last][last-offset] = a[i][last];
				
				//top -> right
				a[i][last] = top;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		
	}

}
