package MultiDimension;

class Student1{
	String name;
	int age;
	int phone;
	Student1(String name,int age,int phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
}

public class FrequencyOfEachObject {
	public static void main(String[] args) {
		Student1 s1=new Student1("Ajay",21,998769);
		Student1 s2= new Student1("Ram",22,998658);
		Student1 s3=new Student1("Ram",23,986680);
		Student1 s4=new Student1("Akhil",22,965470);
		Student1 arr[]= {s1,s2,s3,s4};
		String names[]=new String[arr.length];	
		for(int i=0;i<arr.length;i++) {
			names[i]=arr[i].name;
		}
		
		boolean vis[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(vis[i]) continue;
			
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(names[i].equals(names[j])) {
					count++;
					vis[j]=true;
				}
			}
			
			System.out.println(arr[i].name+" "+count);
		
		}
		
		
	}

}

