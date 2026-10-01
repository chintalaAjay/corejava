package matrices;

public class ScalarMatrix {
	public static void main(String[] args) {
		int arr[][]= {
				{10,0,0},
				{0,10,0},
				{0,0,10}
		};
		boolean isscalar=true;
		int first=arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr.length!=arr[i].length) {
				isscalar=false;
				break;
			}
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					if(arr[i][j]!=first) {
						isscalar=false;
						break;
					}
				}
				else {
					if(arr[i][j]!=0) {
						isscalar=false;
						break;
					}
				}
			}
		}
		if(isscalar) {
			System.out.println("scalar matrix");
		}
		else {
			System.out.println("not a scalar matrix");
		}
	}

}
