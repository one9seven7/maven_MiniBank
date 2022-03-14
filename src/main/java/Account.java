import java.util.Scanner;

public class Account {
    private int accountNo;
    private String accountName;
    private String accountSurname;
    private long balance;

    Scanner scanner = new Scanner(System.in);

    public Account(int accountNo, String accountName, String accountSurname, int balance){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountSurname = accountSurname;
        this.balance = balance;
    }

    public Account() {
    }


    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void openAccount(){
        System.out.println("Id");
        accountNo = scanner.nextInt();
        System.out.println("Podaj Imie");
        accountName = scanner.next();
        System.out.println("Podaj nazwisko");
        accountSurname = scanner.next();
        System.out.println("Podaj stan konta");
        balance = scanner.nextInt();
    }

    public void showAccount(){
        System.out.println("Name is: " + accountName + " Surname is: " + accountSurname + " Your balance is: " + balance + ".");
    }
}

