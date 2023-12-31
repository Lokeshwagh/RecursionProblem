//i find the factorial by using a recursion
public class factorial {
    static int fac(int n){
        if(n==0) return 1;// put the condiation where the fac close
        //recursion work
        int smalles=fac(n-1);
        //self work
//        int ans=n*smalles;

//        return ans; <==asa lan
        return n*fac(n-1);
    }
    public static void main(String[] args) {

        System.out.println(fac(5));
    }
}
