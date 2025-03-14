import java.util.Scanner;

public class countDigit {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);

        int n= sc.nextInt();
        int numofdigit=0;
        int original_n = n;
        while(n > 0){
            n= n/10;
            numofdigit++;
        }
        System.out.println("Number of digit is" + original_n+"=" +numofdigit);


    }
    
}
