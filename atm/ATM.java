public class ATM {
    private User user;
    public ATM(User user){
        this.user = user;
    }
    public void withdraw(int amount){
        int balance = user.getBalance();
        balance -= amount;
        if(balance<0){
            System.out.println("Insufficient balance!!");
        }else{
            user.setBalance(balance);
            System.out.println("Rs. "+amount+" withdrawn successfully!");
        }
        completeMessage();
    }
    public void deposit(int amount){
        int balance = user.getBalance();
        user.setBalance(balance+amount);
        System.out.println("Rs. "+amount+" deposited successfully!");
        completeMessage();
    }
    public void checkBalance(){
        System.out.println("\n"+user.toString());
    }
    void completeMessage(){
        System.out.println("trasaction completed.");
        System.out.println("Available balance: "+user.getBalance());
    }
}