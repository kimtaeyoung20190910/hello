package hello.common;

public class Test {
	int studentNo;
	String Name;
	int grade1;
	int grade2;
	int grade3;

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}

	Test() {
	}

	Test(int studentNo, String Name, int grade1, int grade2, int grade3) {
		this.studentNo = studentNo;
		this.Name = Name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	@Override
	public String toString() {
		return "[학번=" + studentNo + ", 이름=" + Name + ", 국어=" + grade1 + ", 영어=" + grade2 + ", 수학=" + grade3 + "]";
	}
}
