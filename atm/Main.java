import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User("Joshini",90908069,1000);
        ATM atm = new ATM(user);
        System.out.println("Welcome, "+user.getName());
        System.out.println();

        Boolean loop = true;
        while(loop){
            System.out.println("\n1. Withdraw\n2. Deposit\n3. Check Balance");
            System.out.print("Select option: ");
            int option = sc.nextInt();

            if(option==1){
                System.out.print("\nEnter amount to withdraw: ");
                int amount = sc.nextInt();
                atm.withdraw(amount);
            }else if(option==2){
                System.out.print("\nEnter amount to deposit: ");
                int amount = sc.nextInt();
                atm.deposit(amount);
            }else{
                atm.checkBalance();
            }
            System.out.print("\nExit ATM(y/n): ");
            sc.nextLine();
            String choice = sc.nextLine();
            loop=(choice.equals("y"))?false:true;
        }
    }
}