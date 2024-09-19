
public class Student extends Person {
	private int feesPaid;
	private int feesTotal;

	public Student(String name, int id, int grade) {
		// calling super constructor
		super(name, id, grade);
		
		// intial fees 
		this.feesPaid = 0;
		
		//choose which grade student is in
		switch(grade) {
		case 1:
			this.feesTotal = 1000;
			break;
		case 2:
			this.feesTotal = 1500;
			break;
		case 3:
			this.feesTotal = 2000;
			break;
		default:
			System.out.println("Invalid Enterd grade");
		}
	
	}

	public int totalFees() {
		return feesTotal;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(fees);
	}
	
	public int getFeesPaid() {
        return feesPaid;
    }
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString() {
		return "* Student's name " + "\"" + super.getName() + "\"" + "\n" +
				"* Yearly Fees " + feesTotal + "\n" +
				"* Total fees paid so far $"+ feesPaid + "\n" +
				"* Total Remaining Fees" + getRemainingFees() +"\n"; 
	}
	
	@Override
	public void updateGrade(int grade) {
		super.updateGrade(grade);
		
		switch(grade) {
		case 1:
			this.feesTotal = 1000;
			break;
		case 2:
			this.feesTotal = 1500;
			break;
		case 3:
			this.feesTotal = 2000;
			break;
		default:
			System.out.println("Invalid Enterd grade");
		}
	}
}
