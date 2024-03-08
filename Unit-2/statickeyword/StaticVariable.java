package statickeyword;
public class StaticVariable {
	public int idNum; // instance variable or non-static Variable
	public String name;
	public String dept;
	public double cgpa;
	public static String collegeName; // static variable
	
	static {
		System.out.println("I am in Static Block");
		collegeName = "Veltech University";
	}
//	public StaticVariable(){ // default constructor // no-arg constructor
//		
//	}
//	
	public StaticVariable(int idNum,String name,String dept,double cgpa) {
		this.idNum = idNum;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	public static void main(String []args) {
		System.out.println(collegeName);
		StaticVariable s1 = new StaticVariable(1,"ABCD","DS",9.8);
		System.out.println(s1.idNum);
		System.out.println(s1.name);
		System.out.println(s1.dept);
		System.out.println(s1.cgpa);
		System.out.println(s1.collegeName);
		StaticVariable s2 = new StaticVariable(2,"XYZ","CSE",9.65);
		System.out.println(s2.idNum);
		System.out.println(s2.name);
		System.out.println(s2.dept);
		System.out.println(s2.cgpa);
		System.out.println(s2.collegeName);
	}	
}
