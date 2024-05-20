import java.math.BigInteger;
import java.util.Scanner;

public class Powerbig {
    // function definition
    public static BigInteger powerfind(BigInteger a,int b){
        BigInteger result, finalresult;
        if (b==1){
            return a;
        }
        else{
            result = powerfind(a, b/2);
            finalresult = result.multiply(result);
          if(b%2==0){
            return finalresult;
          }
          else{
            return a.multiply(finalresult);
          }
        }
    }
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of a and b:");
    BigInteger a= sc.nextBigInteger();
    int b= sc.nextInt();
    // function calling
    BigInteger result = powerfind(a,b);
    System.out.println("the value of power of number is :"+result);
    }
}
