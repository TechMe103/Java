public class fibonacciSeries {

    static int fib(int n){

        //base case
        if(n==0) return 0;
        if(n==1) return 1;
        //if(n==0  ||  n==1)  return n;

        //recursive case
        int prev= fib(n-1);
        int prevPrev= fib(n-2);

        int ans= prev + prevPrev;
        return ans;
    }
    public static void main(String[] args) {

        for(int i=0; i<= 10 ; i++){
            System.out.println(fib(i));
        }
        System.out.println("Fib of 6 is:");
        System.out.println(fib(6));
    }
}
