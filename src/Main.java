public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("Tobias", 123876.98);
        System.out.println(a1);

        a1.deposit( 567.769);
        System.out.println(a1);


        a1.withdraw(567.76);
        System.out.println(a1);

        System.out.println(a1.getBalance());
    }
}