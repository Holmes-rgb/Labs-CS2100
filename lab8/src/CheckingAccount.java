public class CheckingAccount extends BankAccount{
    private static final double FEE = 0.15;
    public CheckingAccount(String name, double amount){
        super(name,amount);
        setAccountNumber(this.getAccountNumber() + "-10");
    }

    @Override
    public boolean withdraw(double amount)
    {
        amount += FEE;
        super.withdraw(amount);
        return super.withdraw(amount);
    }
}
