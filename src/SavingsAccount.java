public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount() {
        //Leave out super()! You don't need it!
        interestRate = 0;
    }

    public SavingsAccount(double bal, int i, String o, double ir) {
        super(bal, i, o);
        interestRate = ir;
    }

    public void addInterest() {
        super.deposit(super.getBalance() * interestRate);
    }

}