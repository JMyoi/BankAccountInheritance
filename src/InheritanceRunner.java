

public class InheritanceRunner {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(4523, 1, "John Doe");
        CheckingAccount c = new CheckingAccount(245, 3679, "Weir", 5, 100);
        SavingsAccount s = new SavingsAccount(2145, 2, "Person", .0035);
        System.out.println(b.getBalance());
        b.withdraw(100);
        System.out.println(b.getBalance());

        System.out.println(c.getBalance());
        c.withdraw(1000);
        System.out.println(c.getBalance());

        System.out.println(s.getBalance());
        s.addInterest();
        System.out.println(s.getBalance());
    }
}