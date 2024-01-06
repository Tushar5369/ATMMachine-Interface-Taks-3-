package ATMMachine;
import java.util.*;

public class ATM {
    float Balance;
    int PIN=5674;
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enterepin=sc.nextInt();
        if(enterepin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin:");
        }
    }

    public void menu(){
        System.out.println("Enter your Choice:");
        System.out.println("1. Check A/C Balance:");
        System.out.println("2. Withdraw Money:");
        System.out.println("3. Deposit Money:");
        System.out.println("4. Exit......");


        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            WithdrawMoney();

        } else if (opt==3) {
            DepositMoney();

        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter the valid choice:");
        }
    }

    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance:");
        }
        else {
            Balance=Balance-amount;
            System.out.println("Money Withdrawal Successful...");
        }
        menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposit Successful...");
        menu();
    }
}

