import java.util.*;

public class School {
	private Hashtable<Integer,Teacher> teachers;
	private Hashtable<Integer,Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;

	public School(Hashtable<Integer,Teacher> teachers, Hashtable<Integer,Student> students) {
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}

	public void addTeacher(Teacher teacher,int id) {
		teachers.put(id,teacher);
	}

	public Hashtable<Integer,Teacher> getTeachers() {
		return teachers;
	}

	public void addStudent(Student student,int id) {
		students.put(id,student);
	}

	public Hashtable<Integer,Student> getStudents() {
		return students;
	}

	// money earned from students is stored here
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	// money spent on teachers salary
	// every teacher takes salary depends on his grade
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
		totalMoneySpent += moneySpent;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

}
