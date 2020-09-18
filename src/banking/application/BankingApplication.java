/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Scanner;
package banking.application;
import java.util.Scanner;
/**
 *
 * @author rahat
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount obj1= new BankAccount("XYZ","BA0001");
        obj1.showMenu();
    }
    
}
class BankAccount
{
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

BankAccount(String cname, String cid)
{
    customerName = cname;
    customerId = cid;
}
void deposit(int amount)
{
    if(amount != 0)
    {
    balance = balance + amount;
    previousTransaction= amount;
}
        }
void withdraw(int amount)
{
if (amount != 0)
{
    balance = balance -amount;
    previousTransaction = -amount;   
}
}
void getPreviousTransaction()
{
    if(previousTransaction >0)
    {
    System.out.println("Deposited: "+previousTransaction);
    }
    else if(previousTransaction<0)
    {
    
        System.out.println("Withdrawn: "+Math.abs(previousTransaction));
    }
        else
        {
         System.out.println("No transaction occure");
        }         
                
    }


void showMenu() 
{
char option = '\0';
Scanner scanner = new Scanner(System.in);
System.out.println("Welcom" +customerName);
System.out.println("your ID" + customerId);
System.out.println("\n");
System.out.println("A. check Balance");
System.out.println("B. deposit");
System.out.println("C. Withdraw");
System.out.println("D. Previous transaction");
System.out.println("E. Exit");
do
{
    System.out.println("============================================");
    System.out.println("Enter an option");
    System.out.println("============================================");
    option = scanner.next().charAt(0);
    System.out.println("\n");
  switch(option)
  {
    case 'A':
        
    System.out.println("=========================================");
    System.out.println("Balance = "+balance);
    System.out.println("____________________________________--");
    System.out.println("\n");
    break;
    case 'B':
    System.out.println("=========================================");
    System.out.println("Enter an amount to deposit ");
    System.out.println("____________________________________--");
    int amount=scanner.nextInt();
    deposit(amount);
    System.out.println("\n");
    break;
    case 'C':
    System.out.println("=========================================");
    System.out.println("Enter an amount to withdraw");
    System.out.println("____________________________________--");
    int amount2 = scanner.nextInt();
    withdraw(amount2);
    withdraw(amount2);
    System.out.println("\n");
    break;
    case 'D':
    System.out.println("=========================================");
    getPreviousTransaction();
    System.out.println("____________________________________--");
    System.out.println("\n");
    break;
    case 'E':
    System.out.println("=========================================");
    break;
    default:
    System.out.println("Invalid Option!!. Please enter the correct option");
    break;
}

}while(option !='E');
}}

