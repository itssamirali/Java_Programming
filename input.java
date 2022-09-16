import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");    
		int a = sc.nextInt();   
		System.out.println("Enter number 2");    
		int b = sc.nextInt();     

		int sum = a +b;   
		System.out.println("The sum of these numbers is " +  sum);
		//System.out.println(sum);
		//boolean b1 = sc.hasNextInt();
		//System.out.println(b1);
        //String str = sc.next();
        //String str = sc.nextLine();
        //System.out.println(str);

    }
}