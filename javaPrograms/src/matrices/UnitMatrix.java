package matrices;

public class UnitMatrix {
	public static void main(String[] args) {
		int arr[][]= {
				{1,0,0},
				{0,1,0},
				{0,0,1}
		};
		boolean isunit=true;
		for(int i=0;i<arr.length;i++) {
			if(arr.length!=arr[i].length) {
				isunit=false;
				break;
			}
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					if(arr[i][j]!=1) {
						isunit=false;
						break;
					}
				}
				else {
					if(arr[i][j]!=0) {
						isunit=false;
						break;
					}
				}
			}
		}
		if(isunit) {
			System.out.println("unit matrix");
		}
		else {
			System.out.println("not a unit matrix");
		}
	}

}
