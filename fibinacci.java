// for printing the fibonacci series in java
public class fibinacci {
    static int fabi(int n){
        if(n==0||n==1) return n;
        return fabi(n-1)+fabi(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fabi(4));
    }
}
