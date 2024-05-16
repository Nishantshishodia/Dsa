import java.util.Scanner;
public class fibonacciseries {
    public static  int fibonacciseries (int n){
        int result=0;
        if (n<=1){
            return n;
        }
        else{
            result= fibonacciseries(n-1)+ fibonacciseries(n-2);
        }
        return result;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of fibonaci series :");
        int n = sc.nextInt();
        int result= fibonacciseries(n);
        System.out.println("The fibonacci series of a given number is: "+result);
    }
}
