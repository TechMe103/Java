import java.util.Scanner;

public class findIndexX {
    static int findindex(int arr , int x ){
        int n= arr.length;
        for(int i=0; i< n ; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter array size:");
        int n= sc.nextInt();
        System.out.println("Enter array :");
        //int[] arr= new int[n];
        int arr= sc.nextInt();
        System.out.println("Enter value of X:");
        int x= sc.nextInt();
        findindex(arr , x);
        System.out.println();

    }
}
