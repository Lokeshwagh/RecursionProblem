//finding the kth multiple of the number using recursion
public class kTHmULTIPLE {
    static void Kthmultiples(int n, int k){
        //base case
        if(k==1){
            System.out.print(" "+n);
            return ;
        }
//        recursive work
        Kthmultiples(n,k-1);
//        self work
        System.out.print(" "+n*k);

    }
    public static void main(String[] args) {
       Kthmultiples(12,5);
    }
}
