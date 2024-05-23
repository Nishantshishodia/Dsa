import java.util.Scanner;

public class TilingProblem {
    public static int Gateway(int n)
    {
        if(n<=3){
            return n;
        }
        else{
            return Gateway(n-1)+Gateway(n-2);
        }
         }
    
    public static void main(String[]args){
        System.out.println("enter the value of n:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
// function calling
        int result= Gateway(n-1)+Gateway(n-2);
        System.out.println("the value of tiling problem is :"+result);
    }
}
