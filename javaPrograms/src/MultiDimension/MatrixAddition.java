package MultiDimension;

import java.util.Arrays;

public class MatrixAddition {
	public static void main(String[] args) {
		int n1[][]= {
				{10,20},
				{30,40}
		};
		int n2[][]= {
				{5,7},
				{3,6}
		};
		int res[][]=new int[n1.length][n1[0].length];
//		int sum=0;
		for(int i=0;i<n1.length;i++) {
			for(int j=0;j<n1[0].length;j++) {
				res[i][j]=n1[i][j]+n2[i][j];
			}
			System.out.println(Arrays.toString(res[i]));
		}
		
				
	}

}
