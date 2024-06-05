public class User {
    private String name;
    private int accNo;
    private int balance;
    public User(String name, int accNo, int initialDeposit){
        this.name=name;
        this.accNo=accNo;
        this.balance=initialDeposit;
    }
    public void setBalance(int amount){
        this.balance=amount;
    }
    public int getBalance(){
        return this.balance;
    } 
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return (
            "*** Account details ***\n"+
            "Name: "+this.name+"\n"+
            "Account no: "+this.accNo+"\n"+
            "Balance: "+this.balance+"\n"+
            "**********************************"
        );
    }
}