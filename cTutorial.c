#include<stdio.h>

int main(){
    printf("Hello world\n");
    printf("Welcome");

    int number= 25;
    char ch='a';
    int age=21;
    float p=3.12;
    int ageee;

    printf("Age is %d \n" , age);
    printf("no is: %f \n" , p);
    printf("Char is: %c \n" , ch);

    //taking input
    printf("Enter age:");
    scanf("%d" , &ageee);
    printf("Age is: %d" , ageee);

    int a, b;
    printf("Enter a:");
    scanf("%d" , &a);

    printf("Enter b:");
    scanf("%d" , &b);

    int sum= a+b;
    printf("Sum is : %d"  , sum);

    //print area of square
    int side;
    printf("Enter side:");
    scanf("%d" , &side);

    printf("Area is: %f" , side * side );

    //area of circle
    float radius;
    printf("Enter radius:");
    scanf("%f" , &radius);

    printf("Area is: %f" , 3.14 *radius * radius );

    //learn maths formula

    int a1= 22;
    int b1= a1;
    int c1= b1 * 4;
    int d= 1, e;

    int a, b , c;
    a= b= c=1;

    int a=1, b=2;
    int sum= a+b;
    int mul= a*b;
    int x, y= a* b;

    int b, c;
    b=c=1;
    int a=b+c;
    int power= pow(b, c);
    printf("%d" , power);
    printf("%d \n" , 8%4);
    printf("%f \n" , 2.0 *2);  //type conversation
    




    return 0;

}