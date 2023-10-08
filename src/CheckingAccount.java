/**
 *
 * @author richard.weir
 *
 * Inheritance!
 *
 * Allows for the sharing of code between classes.
 * Also allows for the addition (extension) of this class
 * ...adding data and functionality
 *
 * the keyword in Java for inheritance is "extends"
 *
 * ***IMPORTANT***
 * Inheritance relationships are called "IS-A" relationships.
 * For example, a Dog "IS-A" Mammal
 * A Human "IS-A" Mammal
 * "IS-A" Human a Dog? no.
 *
 * When a class (subclass or derived class) extends another (superclass or base class)
 * it (child) inherits all protected and public data and behavior from the parent class
 * THE CHILD CLASS DOES NOT GET PRIVATE DATA OR METHODS!
 * CHILD CLASSES DO NOT INHERIT CONSTRUCTORS!!!!!!
 *
 */
public class CheckingAccount extends BankAccount {
    private double overdraftFee;
    private double minBalance;

    public CheckingAccount() {
        //Java will give you a freebie - if you don't call super()
        //explicitly, it will check to see if the parent (ONE LEVEL UP) 
        //has a default constructor; and, if so, calls it for you
        super();  //<--- don't need it!
        overdraftFee = 1000000.00;
        minBalance = 100.00;
    }

    public CheckingAccount(double bal, int i, String o, double fee, double mb) {
        //balance = bal; //NO - balance is private in BankAccount
        //Although this class does not inherit constructors, we can USE them!!!
        //the keyword we use for "using" parent stuffs is "super"
        //If I am to use a parent's constructor, it must be the first line
        //in a child constructor.
        super(bal, i, o);   //balance, id, and owner will be assigned values!
        overdraftFee = fee;
        minBalance = mb;
    }

    /****************************************
     * METHOD OVERRIDING!!!!
     *
     * It is the total changing or amending the behavior of a parent's method
     *
     * The method header (signatures) must be the same as the parent's method
     *
     */


    public void withdraw(double amt) {
        //You can call a parent's method inside an overriding method
        super.withdraw(amt);   //<--- the super keyword!
        if (getBalance() < minBalance) {
            System.out.println("How dare you dip below your minimum balance!");
            System.out.println("Inflicting Overdraft Fee!");
            super.withdraw(overdraftFee);
        }
    }

}