import java.util.Scanner;
public class BankingSystem{
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("WELCOME TO THE SIMPLE BANKING SYSTEM");
        System.out.println("PLEASE ENTER UR ACCOUNT NUMBER: ");
        String account_number = scan.nextLine();

        System.out.println("ENTER INITIAL VALUE: ");
        double initial_balance = scan.nextDouble();


        scan.nextLine();

        BankAccount account = new BankAccount(account_number, initial_balance);

        
        
        

        String user_operation="";

        do{
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.EXIT");
            user_operation = scan.nextLine();
            if(user_operation.equals("Deposit")){
                System.out.println("Enter the ammount u want to deposit: ");
                double ammount= scan.nextDouble();
                scan.nextLine();
                account.deposit(ammount);
            }
            else if(user_operation.equals("Withdraw")){
                System.out.println("Enter the value u want to withdraw: ");
                double withdraw_ammount = scan.nextDouble();
                scan.nextLine();
                account.withdraw(withdraw_ammount);
            }
            else if(user_operation.equals("Check Balance")){
                System.out.println("Your balance: "+account.getBalance());
            }
        }while(!user_operation.equals("EXIT"));
    }
}