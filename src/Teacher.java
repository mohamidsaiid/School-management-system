
public class Teacher extends Person{
	private int salary;
	private int salaryEarned;
	private int count = 0;
	private int bouns = 0;
	public Teacher(String name, int id, int level) {
		
		super(name,id,level);

		//choose which Level the teacher is in
		switch(level) {
		case 1:
			this.salary = 3000;
			break;
		case 2:
			this.salary = 5000;
			break;
		case 3:
			this.salary = 7000;
			break;
		default:
			System.out.println("Invalid Enterd grade");
		}
		
		this.salaryEarned = 0;
	}
	
	public int getSalary(){
        return  salary;
    }
	
	public void setBouns(int bouns){
        this.salary += bouns;
        this.bouns += bouns;
    }
	
	public void receiveTotalSalary(){
        salaryEarned += this.salary;
        School.updateTotalMoneySpent(salary);
        System.out.println("You recieved " + getSalary());
        this.salary -= this.bouns;
        this.bouns = 0;
    }
	
	public void receiveAmountOfSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	public int getSalaryEarned() {
		return salaryEarned;
	}
	
	public int numSalaryIsEanrned() {
		return salaryEarned / salary;
	}
	
	@Override
	public String toString() {
		return "Teacher's name " + "\"" + super.getName() + "\"" +
				"\n His Standard Salary " + salary + "\n"; 
	}
	
	@Override
	public void updateLevel(int level) {
		super.updateLevel(level);
		
		switch(level) {
		case 1:
			this.salary = 3000;
			break;
		case 2:
			this.salary = 5000;
			break;
		case 3:
			this.salary = 7000;
			break;
		default:
			System.out.println("Invalid Enterd grade");
		}
	}
	
}
