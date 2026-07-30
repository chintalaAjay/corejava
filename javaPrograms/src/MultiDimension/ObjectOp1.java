package MultiDimension;

class Student{
	String name;
	int age;
	int phone;
	Student(String name,int age,int phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
}

public class ObjectOp1 {
	public static void main(String[] args) {
		Student s1=new Student("Ajay",21,998769);
		Student s2= new Student("Ram",22,998658);
		Student arr[]= {s1,s2};
		for(Student st:arr) {
			StringBuilder sb=new StringBuilder();
			for(int i=st.name.length()-1;i>=0;i--) {
				sb.append(st.name.charAt(i));
			}
			st.name=sb.toString();
		}
		for(Student st:arr) {
			System.out.println(st.name);
		}
		
		
	}

}
