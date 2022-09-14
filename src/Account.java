public class Account {
    // a double isn't the best data type to store money transactions, due to floating-point rounding errors.
    // But I think it will be sufficient for this excercise.
    private int balance;
    private String name;

    private static int count = 0;

    public Account() {
        this.balance = 0;
        this.count ++;
    }

    public Account(double balance) {
        this.balance = (int)(balance * 100);
        this.count ++;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = (int)(balance * 100);
        this.count ++;
    }

    public double withdraw(double withdrawSum) {
        if(this.balance >= (int)withdrawSum*100 && withdrawSum > 0) {
            this.balance -= (int) (withdrawSum * 100);
            return withdrawSum;
        }
        return 0;
    }


    public void deposit(double depositSum) {
        if(depositSum > 0) {
            this.balance += (int) (depositSum * 100);
        }
    }

    public double getBalance(){
        return (double)this.balance/100;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Count: " + count + "\t\t" + "Account holder: " + name + "\t\t" +
                "Savings: " + (double)balance/100 + " kr";
    }
}
