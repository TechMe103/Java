public class factorialByRecursive {

    static int factorial(int n){

        //base case
        if(n==0) return 1;

        //recursive case
        int smallAns= factorial(n-1);

        //selfwork
        int ans= n * smallAns;
        return ans;
    }
    public static void main(String[] args) {
        int ans= factorial(4);
        System.out.println(ans);
    }
}
