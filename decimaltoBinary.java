import java.util.Scanner;

public class decimaltoBinary {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int decimal_no= sc.nextInt();
        int ans=0;
        int pw=1;  //power of ten
        
        while( decimal_no > 0){
            int parity= decimal_no % 2;
            ans+= (parity * pw);
            pw*=10;
            decimal_no/=2;
        }
        System.out.println(ans);
    }
}
