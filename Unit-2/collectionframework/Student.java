package collectionframework;
public class Student {
	public int rollNo;
	public String name;
	public String dept;
	public double cgpa;
	public Student(int rollNo,String name,String dept,double cgpa) {
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "RollNo : "+rollNo+"\nName : "+name+"\nDept : "+
				dept+"\nCGPA : "+cgpa;
	}
}
