import java.util.Scanner;
// this code is for finding the n natural number
public class PrintI {
    static void PrintIncreasing(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        PrintIncreasing(n-1);
        {
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        PrintIncreasing(n);
    }
}
