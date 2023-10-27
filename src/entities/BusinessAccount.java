package entities;

public class BusinessAccount extends Account{
	
	private Double loanLimits;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimits) {
		super(number, holder, balance);
		this.loanLimits = loanLimits;
	}

	public Double getLoanLimits() {
		return loanLimits;
	}

	public void setLoanLimits(Double loanLimits) {
		this.loanLimits = loanLimits;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimits) {
		balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
