import java.util.Scanner;

public class continuekey {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int num =1;
        //for(int i=1 ; i<= 50; i++){
        //    if(num % 3==0){
        //        continue;
        //    }
        //    System.out.println(i);;
        //}
        while( num <=50){
            if(num % 3==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
        
    }
    
}
