import java.util.Scanner;

public class ageGroup {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int age= sc.nextInt();
        if(age <= 15){
            System.out.println("Child");
        }else if(age > 12 && age < 18){
            System.out.println("Young");

        }else{
            System.out.println("Old");
        }
    }
    
}
