import java.util.Scanner;

public class binarytoDecimal {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);

        int binary_no= sc.nextInt();
        int ans=0;
        int pw=1;

        while ( binary_no > 0) {
            int unit_digit= binary_no % 10;
            ans+=(unit_digit * pw);
            binary_no/= 10;
            pw*=2;

        }
        System.out.println(ans);
        
    }
}
