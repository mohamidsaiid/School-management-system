
public class Person {
	private String name;
	private int id;
	private int grade;
	
	public Person(String name,int id,int grade){
		this.name=name;
		this.id = id;
		this.grade = grade;
	}
	
	public void updateGrade(int grade) {
		this.grade = grade;
	}
	
	public void updateLevel(int grade) {
		this.grade = grade;
	}
	
	public int getGarde(){
		return grade;
	}
	
	public int getLevel(){
		return grade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
