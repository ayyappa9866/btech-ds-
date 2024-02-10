package classesandobjects;

public class Student {
	private long rollNo;
	private String name;
	private char gender;
	private String dept;
	public boolean setRollNo(long rollNo) {
		int nod = (int)Math.log10(rollNo) + 1;
		if(nod == 10) {
			this.rollNo = rollNo;
			return true;
		}
		return false;
	}
	public boolean setName(String name) {
		int len = name.length();
		boolean f = true;
		for(int i = 0;i < len;i++) {
			char ch = name.charAt(i);
			if((ch >= 'A' && ch <= 'Z') ||(ch >= 'a' && ch <= 'z') || ch == ' ') {
				continue;
			}else {
				f = false;
				break;
			}
		}
		if(f) {
			this.name = name;
			return true;
		}
		return false;
	}
	public boolean setGender(char gender) {
		if(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
			this.gender = gender;
			return true;
		}
		return false;
	}
	public boolean setDept(String dept) {
		if(dept.equals("CSE") ||dept.equals("ECE") ||dept.equals("EEE")) {
			this.dept = dept;
			return true;
		}
		return false;
	}
	public long getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return "RollNo : "+rollNo+"\nName : "+name+"\nGender : "+gender+"\nDept : "+dept;
	}
}
