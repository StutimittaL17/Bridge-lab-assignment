import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    long accountNumber,balance;
    BankAccount(String accountHolder,long accountNumber,long balance)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void display(long D)
    {
        System.out.println(D);
        System.out.println(balance);
        System.out.println(balance-D);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        long AN= sc.nextInt();
        long B= sc.nextInt();
        BankAccount ob=new BankAccount(s,AN,B);;
        System.out.println("enter depositing amount");
        long D= sc.nextInt();
        ob.display(D);
    }
}
