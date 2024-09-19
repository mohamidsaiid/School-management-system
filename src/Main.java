import java.util.*;

public class Main {
	static Hashtable<Integer, Student> studentTable = new Hashtable<>();

	static Hashtable<Integer, Teacher> teacherTable = new Hashtable<>();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = 0;
		do {
			System.out.println("for teachers press 1 - for students press 2 - for school press 3");
			int v = in.nextInt();
			switch (v) {
			case 1:
				teacher();
				break;
			case 2:
				student();
				break;
			case 3:
				school();
				break;
			default:
				System.out.println("an error has occurred");
				break;
			}
			System.out.println("to continue press 1 to quit press any other key");
			x = in.nextInt();
		} while (x == 1);
		
	}

	public static Student createNewStd(String name, int id, int grade) {
		Student x = new Student(name, id, grade);
		return x;
	}

	public static void student() {

		Scanner in = new Scanner(System.in);

		System.out.print("to add a new student enter 1" + "\n" + "For an existing student enter 2 : ");

		int x = in.nextInt();
		System.out.println();

		while (true) {
			if (x == 1 || x == 2)
				break;
			else {
				System.out.print("Enter Valid Choose : ");
				x = in.nextInt();
			}
		}

		System.out.println();

		if (x == 1) {
			System.out.print("How many Students you need to add : ");
			int n = in.nextInt();

			System.out.println();

			while (true) {
				if (n == 0) {
					break;
				} else {
					String name;
					int id;
					int grade;
					System.out.print("Enter the new student's name : ");
					name = in.next();

					System.out.print("Enter the new student's ID : ");
					id = in.nextInt();

					System.out.print("Enter the new student's grade : ");
					grade = in.nextInt();
					while (true) {
						if (grade == 1 || grade == 2 || grade == 3) {
							break;
						} else {
							System.out.print("Enter Valid Choose : ");
							grade = in.nextInt();
						}
					}
					Student newOne = createNewStd(name, id, grade);
					studentTable.put(id, newOne);
					n--;
				}
			}

			System.out.println();

		} else {
			while (true) {
				System.out.print("Enter Student's ID : ");
				int studentID = in.nextInt();
				while (studentTable.containsKey(studentID) != true) {
					System.out.print("Enter existing student ID");
					studentID = in.nextInt();
				}
				Student std = studentTable.get(studentID);
				System.out.println(std + "\n");

				System.out.print("Which process do you need\n" + "For yearly fees inquiry Enter 1\n"
						+ "For paying yearly fees Enter 2\n" + "For remaining unpaid fees Enter 3\n"
						+ "For updating his grade Enter 4 : ");

				System.out.println();

				int process = in.nextInt();
				while (true) {
					if (process == 1 || process == 2 || process == 3 || process == 4) {
						break;
					} else {
						System.out.print("Enter Valid Choose : ");
						process = in.nextInt();
					}
				}
				if (process == 1) {
					System.out.println(std.totalFees());
				} else if (process == 2) {
					System.out.print("How much money you need to pay : ");
					int paidMoney = in.nextInt();
					std.payFees(paidMoney);
				} else if (process == 3) {
					System.out.println("Your fees paid = " + std.getFeesPaid());
					System.out.println("Your remaining unpaid fees : " + std.getRemainingFees());
				} else {
					System.out.print("Enter your new grade : ");
					int newGrade = in.nextInt();
					std.updateGrade(newGrade);
				}
				System.out.println("For any other process Enter 'S'\n" + "Or if you need to quit Enter 'Q' : ");
				char other = in.next().charAt(0);
				if (other == 'q') {
					break;
				}
			}
		}

	}

	public static Teacher createNewTeacher(String name, int id, int level) {
		Teacher y = new Teacher(name, id, level);
		return y;
	}

	public static void teacher() {
		Scanner in = new Scanner(System.in);
		String name;
		int id;
		int level;
		System.out.println("To add a new teacher enter 1" + "\n" + "For an existing teacher enter 2 : ");
		int x = in.nextInt();
		while (true) {
			if (x == 1 || x == 2)
				break;
			else {
				System.out.print("Enter Valid Choose : ");
				x = in.nextInt();
			}
		}
		if (x == 1) {
			System.out.print("How many Teachers you need to add");
			int n = in.nextInt();
			while (true) {
				if (n == 0) {
					break;
				} else {
					System.out.println("Enter the teachers name");
					name = in.next();
					System.out.println("Enter the teachers id");
					id = in.nextInt();
					System.out.println("Enter the teachers level");
					level = in.nextInt();
					while (true) {
						if (level == 1 || level == 2 || level == 3) {
							break;
						} else {
							System.out.print("Enter Valid Choose : ");
							level = in.nextInt();
						}

					}
					Teacher newOne = createNewTeacher(name, id, level);
					teacherTable.put(id, newOne);

				}
				n--;
			}
		} else {
			while (true) {
				System.out.print("Enter Teacher ID's : ");
				int teachersID = in.nextInt();
				while (teacherTable.containsKey(teachersID) != true) {
					System.out.print("Enter existing teacher ID");
					teachersID=in.nextInt();				
					}
				Teacher teacher = teacherTable.get(teachersID);
				System.out.println(teacher + "\n");
				System.out.println("Which process do you need\n" + "To view salary Enter 1\n" + "To set bonus Enter 2\n"
						+ "To view salary earned Enter 3\n" + "To update level Enter 4 : \n"
						+ "To receive amount of salary Enter 5 : \n" + "To receive the total salary 6 : \n");

				int process = in.nextInt();
				while (true) {
					if (process == 1 || process == 2 || process == 3 || process == 4 || process == 5 || process == 6) {
						break;
					} else {
						System.out.print("Enter Valid Choose : ");
						process = in.nextInt();
					}
				}
				if (process == 1) {
					System.out.println(teacher.getSalary());
				} else if (process == 2) {
					int bonus;
					System.out.println("Enter the amount of bonus");
					bonus = in.nextInt();
					teacher.setBouns(bonus);
				} else if (process == 3) {
					System.out.println(teacher.getSalaryEarned());
				} else if (process == 4) {
					System.out.println("enter the new level ");
					int new_level = in.nextInt();
					teacher.updateLevel(new_level);
				} else if (process == 5) {
					int sal = in.nextInt();
					teacher.receiveAmountOfSalary(sal);
				} else {
					teacher.receiveTotalSalary();
				}
				System.out.println("For any other process Enter 'S'\n" + "Or if you need to quit Enter 'Q' : ");
				char other = in.next().charAt(0);
				if (other == 'q') {
					break;
				}
			}

		}
	}
	
	public static void school() {
		Scanner in = new Scanner(System.in);
		int x = 0;
		School manhal = new School(teacherTable,studentTable);
		do {
			System.out.println("For money spent Enter 1 : \n"+
								"For money earned Enter 2 : ");
			int v = in.nextInt();
			switch(v) {
			case 1:
				System.out.println(manhal.getTotalMoneySpent());
				break;
			case 2:
				System.out.println(manhal.getTotalMoneyEarned());
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			}
			System.out.println("To continue using school press 1 to quit press any other key");
			x = in.nextInt();
		}while(x == 1);
	}
}
