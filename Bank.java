import java.util.*;
public class Bank {
     public static void main ( String[]args){
       
     double balance=0;

     Scanner sc=new Scanner(System.in);

    do{ 
    System.out.println("=====BANK MENU=====\n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit");
    System.out.print("Enter your choice:");
    int choice=sc.nextInt();

    switch (choice){
     //
    case 1:
    System.out.print("Enter amount to deposit:");
    double deposit=sc.nextInt();

    if (deposit<=0){
    System.out.println("Sorry, you can't deposit"); 
    }
    else{
    System.out.println("Seccessfully deposited: $"+deposit);
    balance+=deposit;
    System.out.println("New balance: $"+balance);
    }
    break;

    //
    case 2:
    System.out.print("Enter amount to withdraw:");
    double withdraw=sc.nextInt();

    if(withdraw>balance){
    System.out.println("Sorry, you can't withdraw");
    }
    else if(withdraw%50!=0){
    System.out.println("This process can't be completed");
    }
    else{
    System.out.println("Seccessfully withdraw: $:"+withdraw);
    balance-=withdraw;
    System.out.println("Remaining balance: $"+balance);
    }
    break;

    //
    case 3:
    System.out.println("You balance is:"+balance);
    break;
    
    //
    case 4:
    System.out.println("Thank you for banking with us!");
    System.out.println("Final balance:"+balance);
    return;
     }
    }while(true);
    
  
 }
}   

    
  


   
    

 