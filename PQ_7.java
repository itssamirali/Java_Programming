import java.util.Scanner;
class PQ_7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number which you want to print ht eTable");
        int a = sc.nextInt();

    for(int j = 0; j<10; j++){
        System.out.println(a + "X" + (j+1) + "=" + (a*(j+1)));
    }
    }
}