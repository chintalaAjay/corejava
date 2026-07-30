package matrices;

public class DiagnolMatrix {
	public static void main(String[] args) {
		int arr[][]= {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		
		boolean diag=true;
		
		for(int i=0;i<arr.length;i++) {
			if(arr.length!=arr[i].length) {
				diag=false;
				break;
			}
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
						
				}
				else {
					if(arr[i][j]!=0) {
						diag=false;
						break;
					}
						
				}
			}
		}
		if(diag) System.out.println("diagnol matrix");
		else System.out.println("not a diagnol matrix");
	}

}
