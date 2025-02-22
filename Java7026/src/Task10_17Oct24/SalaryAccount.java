package Task10_17Oct24;

public class SalaryAccount extends Account{
	int salaryMinBalance = 0;
	SalaryAccount(){
		
	}
	SalaryAccount(int accNo, String name, double balance){
		super(accNo,name,balance);
	}
	public void withdraw(double amount) {
		if(balance > amount && balance - amount >= salaryMinBalance) {
			System.out.println("Succesfully withrawed "+amount);
			balance-=amount;
			System.out.println("Current Balance: "+balance);
		} else {
			System.out.println("Insufficient current minimum balance");
			System.out.println("Current Balance: "+balance);
		}
	}
	
	@Override
	public String toString() {
		return "SalaryAccount [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", salaryMinBalance="
				+ salaryMinBalance + "]";
	}
	public void deposit(double amount) {
		System.out.println("Succesfully deposited "+amount);
		balance += amount;
		System.out.println("Current Balance: "+balance);
	}
}
