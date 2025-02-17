
public class Bank {
	public final static int MAX_ACCOUNTS = 100;

	public static void main(String[] args) {
		// Separate class, can access BankingAccount and SavingsAccount
		// since they're in the same package, otherwise would need to
		// import them.
		BankingAccount banking1 = new BankingAccount(2000, "Joe");
		System.out.println(banking1);
		SavingsAccount savings1 = new SavingsAccount(3000, "Tim", 0.01);
		System.out.println(savings1);
		
		// Polymorphism demo.
		// Make an array of the parent class, but fill it with a mix
		// of any classes in the family tree.
		BankingAccount [] accounts = new BankingAccount[MAX_ACCOUNTS];
		accounts[0] = new BankingAccount(2500, "Sally");
		accounts[1] = new SavingsAccount(7500, "Morgan", 0.02);
		
		System.out.println("List of accounts");
		for (int i=0; i<2; i++) {
			// This will call toString on each account, deciding at
			// runtime which one to call.
			System.out.println(accounts[i]);	
		}
		
		// Can put a child object into a parent reference, but not the
		// other way around.
		BankingAccount banking = new SavingsAccount(3000, "Tim", 0.01);
		//SavingsAccount savings = new BankingAccount(3000, "Tim", 0.01);
		
		// Gross.  Can do something specific for one type of class,
		// but this code gets a bit ugly.
		if (banking instanceof SavingsAccount) {
			((SavingsAccount)banking).monthlyUpdate();
		}
		
		// Could instead maybe add monthlyUpdate to parent, too, 
		// that is just empty for now.
		banking.monthlyUpdate();
		
	}
}
