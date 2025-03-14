public class frogJump {

    
    private static int op;
    static int best(int[] arr, int n, int idx ){

        //base case
        if(idx == n-1)  return 0;
        
        
        if(idx == n-2)  return op;

        int op=Math.abs(arr[idx] - arr[idx]) + best(arr, n, idx+1);
        int op2=Math.abs( arr[idx] - arr[idx+2]) + best(arr, n, idx+2);
        
        return Math.min(op, op2);

    }
    public static void main(String[] args) {
        int[] arr={10 , 20 , 30 , 20};
        System.out.println(best(arr , arr.length , 0));
    }
}
