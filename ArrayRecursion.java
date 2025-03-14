public class ArrayRecursion {

    static void printArray(int[] arr , int idx ){
        int n= arr.length;

        //base case
        if(idx == n) return ;

        //self work
        System.out.println(arr[idx]);

        //recursive work :-  subproblem
        printArray(arr, idx + 1);


    }
    public static void main(String[] args) {
        int[] arr={5 , 6, 7, 8};
        printArray(arr , 0);

    }
}
