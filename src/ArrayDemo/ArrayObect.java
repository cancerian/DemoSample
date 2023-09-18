package ArrayDemo;
 class Student{
public int rollNo;
public String name;
public Student(int rollNo, String name) {
	this.rollNo = rollNo;
	this.name = name;
}

}
public class ArrayObect {

	public static void main(String[] args) {
		
		Student[] arr;
		
		arr=new Student[5];
		arr[0]=new Student(101,"Manish");
		arr[1]=new Student(102,"sam");
		arr[2]=new Student(103,"john");
		arr[3]=new Student(104,"mani");
		arr[4]=new Student(105,"rupesh");
		for(int i=0;i<5;i++) {
			System.out.println("Index "+i+" roll NO :"+arr[i].rollNo+" Name :"+arr[i].name);
		}
		
		
	}

}
