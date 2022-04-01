import java.util.Scanner;

public class machine {
    public static void main(String args [])
    {
        int amount = 0;
        int transaction;
    
    System.out.println("Please type your name here !");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Hello Mr."+ name);
    System.out.println("Please Enter your PIN!");
    int pin = sc.nextInt();
    System.out.println("******************************************************");
    System.out.println("        " + "Welcome to the Axis Bank ATM" + "          ");
    System.out.println("******************************************************");
    System.out.println("********* What would you like to do *********");

    do{

    System.out.println("Press 1 for Depsoit");
    System.out.println("Press 2 for Withdrawl");
    System.out.println("Press 3 for Balance Enquiry");
    System.out.println("Press 4 for Exit");
    
    transaction = sc.nextInt();

    if(transaction==1)
        {

        System.out.println("*** How much amount would you like to deposit ***");
        int deposit = sc.nextInt();
        amount = amount + deposit;
        System.out.println("******************************************************");
        System.out.println("Amount Deposit Successfully");
        System.out.println("******************************************************");
    } 
    else if(transaction==2)
    {
        System.out.println("*** How much amount would you like to Withdrawl ***");
        int Withdrawl = sc.nextInt();
        if(Withdrawl<=amount)
        {
        amount = amount - Withdrawl;
        System.out.println("******************************************************");
        System.out.println("Amount Withdrawl Successfully");
        System.out.println("******************************************************");
        }
        else
        {
         System.out.println(" *** sorry you have Insufficient Balance ****");
        }       
    }
    else if (transaction==3)
    {
        System.out.println("Your account balance is : " + amount);
    }
    }while(transaction==4);

}
}