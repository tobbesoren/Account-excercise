public class Account {
    // using int for balance to avoid float errors.
    private int balance;
    private String name;

    private static int count = 0;

    public Account() {
        this.balance = 0;
        count ++;
    }

    public Account(double balance) {
        this.balance = (int)(balance * 100);
        count ++;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = (int)(balance * 100);
        count ++;
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
