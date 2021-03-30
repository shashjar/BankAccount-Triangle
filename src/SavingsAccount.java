public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int id, double startBal, double intRate) {
        super(id, startBal);
        interestRate = intRate;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.currentBalance()) {
            this.decreaseBalance(amount);
        }
        else {
            System.out.println("Invalid Withdrawal Amount");
        }
    }

    @Override
    public double monthlyInterest() {
        double monthlyInterest = this.currentBalance()*this.interestRate/12.0;
        return monthlyInterest;
    }
}
