public class InterCommunicationExample {
    static class Customer {
        int amount = 10000;
        synchronized void withdraw(int amount) {
            if (this.amount < amount) {
                System.out.println("Less balance; waiting for deposit...");
                try { wait(); } catch (InterruptedException e) { }
            }
            this.amount -= amount;
            System.out.println("Withdraw completed.");
        }

        synchronized void deposit(int amount) {
            this.amount += amount;
            System.out.println("Deposit completed.");
            notify();
        }
    }
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.deposit(10000)).start();
    }
}
