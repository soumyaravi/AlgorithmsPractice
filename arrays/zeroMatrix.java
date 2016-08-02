package arrays;

import java.util.Scanner;

public class zeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][] = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				a[i][j] = sc.nextInt();
		}
		convertMartix(a,m,n);
	}

	private static void convertMartix(int[][] a, int m, int n) {
		// TODO Auto-generated method stub
		boolean rows[] = new boolean[m];
		boolean col[] = new boolean[n];
		boolean row1=false,col1=false;
		for(int i=0;i<m;i++){
			if(a[i][0] == 0)
				row1 = true;
		}
		for(int i=0;i<n;i++){
			if(a[0][i] == 0)
				col1 = true;
		}
		for(int i=1;i<m;i++){
			for(int j = 1;j<n;j++){
				if(a[i][j] == 0){
					rows[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i=1;i<m;i++){
			if(rows[i]){
				for(int j=0;j<n;j++)
					a[i][j] = 0;
			}
		}
		for(int i=1;i<n;i++){
			if(col[i]){
				for(int j=0;j<m;j++)
					a[j][i] = 0;
			}
		}
		if(col1){
			for(int j=0;j<m;j++)
				a[j][0] = 0;
		}
		if(row1){
			for(int j=0;j<n;j++)
				a[0][j] = 0;
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

}
