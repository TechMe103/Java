import java.util.Scanner;

public class breakKeyword {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int num =1;

        for(int i=1; i <= 10; i++){
            if(num ==5) break;
            System.out.println(i);
        }
    }
    
}
