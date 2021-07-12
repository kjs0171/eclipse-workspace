package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "안연승";
		student1.grade = 3;
		student1.studentID = 1000;
		
		Student student2 = new Student();
		student2.studentName = "박이승";
		student2.grade = 3;
		student2.studentID = 1003;
		
		System.out.println(student1.studentName + "의 학년은 " +student1.grade + "학년이고, 번호는 " + student1.studentID);
		System.out.println(student2.getStudentName() + "의 학년은 " +student2.getGrade() + "학년이고, 번호는 " + student2.studentID);
		
		
	}

}
