import java.util.Scanner;

class Algebra {
    int a;
    int b;

    // Constructor to initialize the variables
    Algebra(int x, int y) {
        a = x;
        b = y;
        System.out.println("Constructor called");
    }

    // Method to add the numbers
    int add() {
        return a + b;
    }

    // Method to subtract the numbers
    int sub() {
        return a - b;
    }
}

// Main class to execute the program
public class algebraaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        
        // Creating an object of Algebra with input values
        Algebra obj = new Algebra(x, y);
        
        // Calling methods and printing results
        System.out.println("Sum is: " + obj.add());
        System.out.println("Difference is: " + obj.sub());
        
        sc.close();
    }
}
