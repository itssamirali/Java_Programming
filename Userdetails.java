import java.util.Scanner;
public class Userdetails {
	public static void main (String args []){
		System.out.println("Enter Your Details");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter you Roll No.: ");
		short RollNo = sc.nextShort();
		System.out.println("Enter your mobile no: ");
		double mobileNo = sc.nextDouble();
		System.out.println("Enter your Email id : ");
		String Emailid = sc.nextLine();
		System.out.println("Your Details are : " + name + RollNo + mobileNo + Emailid);
	}
}
		