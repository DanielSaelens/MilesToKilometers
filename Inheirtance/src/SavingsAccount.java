
public class SavingsAccount extends BankingAccount {
	private double interestRate;

	public SavingsAccount(double balance, String owner, double interestRate) {
		super(balance, owner);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		// Write custom version of toString but make use of 
		// parent version, too.
		return "SavingsAccount [interestRate=" + interestRate + " " + super.toString() +  "]";
	}

	public void monthlyUpdate() {
		balance = balance + (balance * interestRate);
	}

	
	




}
