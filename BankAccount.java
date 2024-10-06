public class BankAccount{
    

    public String account_number;
    public double balance;

    public BankAccount(String account_number, double initial_balance){
        this.account_number = account_number;
        this.balance = initial_balance >=0 ? initial_balance : 0;
    }
        
    public void deposit(double ammount){
        if(ammount>0){
            balance += ammount;
        }else{
            System.out.println("The value u want to deposit needs to be greater than 0");
        }
    }

    public void withdraw (double ammount){
        if(ammount > 0 && ammount <= balance){
            balance -= ammount;
        }else{
            System.out.println("U cant do this withdraw");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return account_number;
    }
}