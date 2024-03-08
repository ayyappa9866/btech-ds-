package collectionframework;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Student> s1 = new ArrayList<>();
//		Student[] s = new Student[3]; // array of student type references will be created
		for(int i = 0;i < 3;i++) {
			System.out.println("Enter Student "+(i+1)+"  data :");
			System.out.println("Enter Rollno,Name,Dept and CGPA :");
			int r = input.nextInt();
			input.nextLine();
			String n = input.nextLine();
			String d = input.next();
			double c = input.nextDouble();
			Student s2 = new Student(r,n,d,c);
			s1.add(s2);
		}
		System.out.println("********** Student Data **********");
		for(Student stu:s1) {
			System.out.println(stu.toString());
			System.out.println();
		}				
		input.close();
	}
}
