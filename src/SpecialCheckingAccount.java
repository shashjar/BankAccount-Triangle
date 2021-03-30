public class SpecialCheckingAccount extends CheckingAccount {

    private double annualInterestRate;
    private double minimumBalance;

    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double annIntRate, double minBal) {
        super(idNumber, startBal, cc);
        minimumBalance = minBal;
        annualInterestRate = annIntRate;
    }

    public void clearCheck(double amount) {
        if (this.currentBalance() > this.minimumBalance) {
            decreaseBalance(amount);
        }
        else {
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest() {
        if (this.currentBalance() > this.minimumBalance) {
            double monthlyInterest = this.currentBalance()*this.annualInterestRate/12.0;
            return monthlyInterest;
        }
        else {
            return super.monthlyInterest();
        }
    }

}
