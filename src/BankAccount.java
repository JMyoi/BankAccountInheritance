public class BankAccount {
    private double balance;
    private int id;
    private String owner;

    public BankAccount() {
        balance = 0;
        id = -1;   //impossible number
        owner = "Mystery Person";
    }

    public BankAccount(double bal, int i, String o) {
        balance = bal;
        id = i;
        owner = o;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt; //is this ok?
    }
    public int getId() {
        return id;
    }
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

}