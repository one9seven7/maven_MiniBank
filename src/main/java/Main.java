import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilu użytkownikow chcesz dodaż?");
        int numberOfNewAccounts = scanner.nextInt();
        Account tableOfNewAccouts[] = new Account[numberOfNewAccounts];

        for (int i=0; i< tableOfNewAccouts.length; i++){
            tableOfNewAccouts[i] = new Account();
            tableOfNewAccouts[i].openAccount();
        }
    }
}
