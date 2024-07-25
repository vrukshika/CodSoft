import java.util.Scanner;

class BankAccount {
    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // methods of bank

    public void showBalance() {
        System.out.println("your2 balance:" + balance + "\n");
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("your amount of Rs." + amount + " deposited successfully!!");
            System.out.println("your current balance : " + balance + "\n\n");
        } else {
            System.out.println("amount must greater than zero\n");
        }
    }

    public void withdraw(double withdraw_amt) {
        if (withdraw_amt > 0) {
            if (withdraw_amt <= balance) {
                balance -= withdraw_amt;
                System.out.println("Your amount of Rs." + withdraw_amt + " withdrawed successfully..!!");
                System.out.println("your current balance : " + balance + "\n\n");
            } else {
                System.out.println("Insufficient balance..!!\n");
            }
        } else {
            System.out.println("amount must be positive!!\n");

        }
    }

}

class ATM {
    BankAccount b; // b is instance of class bankAccount
    Scanner sc;

    public ATM(BankAccount bb) {
        b = bb;
        this.sc = new Scanner(System.in);
    }

    // creating atm menu
    public void menu() {
        System.out.println("Welcome to ATM !");
        System.out.println("please choose any option:");
        System.out.println("1.check balance");
        System.out.println("2.Deposite");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }

    public void action(int ch) {
        switch (ch) {
            case 1:
                b.showBalance();
                break;
            case 2:
                System.out.println("enter amount to be deposited:");
                double deposit_amt = sc.nextDouble();
                b.deposite(deposit_amt);
                break;
            case 3:
                System.out.println("enter amount to be withdraw:");
                double withdraw_amt = sc.nextDouble();
                b.withdraw(withdraw_amt);
                break;
            case 4:
                System.out.println("Thank you for using ATM ! visit again..!");
                break;
            default:
                System.out.println("Entered invalid choice..! try again!");
                break;
        }
    }

    public void run() {
        while (true) {
            menu();
            System.out.println("enter your choice:");
            int ch = sc.nextInt();
            if (ch == 4) {
                action(ch);
                break;
            } else {
                action(ch);
            }
        }
    }

}

public class BankModelProject {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(0.0);
        ATM a = new ATM(ba);
        a.run();
    }
}
