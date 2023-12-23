
	class InsufficientBalanceException extends Exception {
	    private int deficiencyAmount;

	    public InsufficientBalanceException(int deficiencyAmount) {
	        this.deficiencyAmount = deficiencyAmount;
	    }

	    public int getDeficiencyAmount() {
	        return deficiencyAmount;
	    }

	    @Override
	    public String toString() {
	        return "Sorry, insufficient balance, you need more " + deficiencyAmount + " Rs. to perform this transaction.";
	    }
	}

	class BankAccount {
	    private int accountBalance;

	    public BankAccount(int initialBalance) {
	        this.accountBalance = initialBalance;
	    }

	    public void withdraw(int amount) throws InsufficientBalanceException {
	        if (amount > accountBalance) {
	            throw new InsufficientBalanceException(amount - accountBalance);
	        } else {
	            accountBalance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: " + accountBalance + " Rs.");
	        }
	    }
	}

	public class Programme29 {
	    public static void main(String[] args) {	        
	        BankAccount bankAccount = new BankAccount(2000);

	        try {	            
	            int withdrawAmount = 2500;
	            bankAccount.withdraw(withdrawAmount);
	        } catch (InsufficientBalanceException e) {	            
	            System.out.println(e);
	        
	        }
}
}