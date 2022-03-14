public class Main{

    public static void main(String[] args) {
        Account user1 = new Account(200200, "Piotr", "Nykiel", 10000);
        Account user2 = new Account();

        System.out.println(user1.getAccountNo());
        user2.setAccountNo(200201);
        System.out.println(user2.getAccountNo());

    }
}
