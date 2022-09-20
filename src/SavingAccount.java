public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void addInterest(int days) {
        double interest =  this.getBalance() * (this.interestRate / 365) * days;
        this.deposit(interest);
        System.out.println(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void transfer (double sum, Account transferTo) {
        if(sum <= this.getBalance()) {
            this.withdraw(sum);
            transferTo.deposit(sum);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tInterest rate: " + getInterestRate() * 100 + " %";
    }
}
