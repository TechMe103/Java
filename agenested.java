import java.util.Scanner;

public class agenested {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int age= sc.nextInt();

        if(age <=18){
            if(age >= 18){
                System.out.println("Can vote and drive");
            }
            else{
                System.out.println("cannot vote");
            }
            
        }

    }
}
    

