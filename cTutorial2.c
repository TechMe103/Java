#include<stdio.h>
#include<math.h>

int main(){

    int a= 1. 9999;
    printf("%d \n" , a); //converstion into int

    int b= 4 * 3 / 6 *2;
    printf("%d \n" , b);

    printf("%d \n", 4==3 );
    printf("%d \n" , 3>4 && 4>3); //&& || !

    int a=2;
    int b=4;
    int a+=b;
    printf("%d \n" , a);
    
    //check if no is divisible by 2 or not
    int x;
    printf("Enter a number:" );
    scanf("%d" , &x);
    printf("%d" , x % 2 ==0);

    int isSunday= 1;
    int isSnowong = 1;
    printf("%d \n" , isSunday && isSnowong);
    printf("%d \n" isSunday || isSnowong );

    int x;
    printf("Enter an  number:");
    scanf("%d" , &x);
    printf("%d \n" , x> 9 && x< 100);

    int age;
    printf("Enter age:");
    scanf("%d" , &age);

    if(age > 18){
        printf("they can vote..");
    }
    else{
        printf("They cannot..");
    }
    
    if(age < 18){
        printf("child");

    }else if(age > 18 && age < 18){
        printf("Teen");
    }
    else{
        printf("Old");
    }

    age >=18 ? printf("Adult \n") : printf("Not adult \n");

    //switch
    switch (day){
        case 1 : printf("Mon \n");
        break;
        case 2: printf("Tue \n");
        break;
        default : printf("Not a valid");

    }
    int num;
    printf("Enter a num:");
    scanf("%d" , &num);

    if(num >=0){
        printf("Positive \n");
        if(num % 2==0){
            printf("Even \n");

        }else{
            printf("Odd \n");
        }
    }
    else{
        printf("Negative \n");
    }

    int marks;
    printf("Enter your marks:");
    scanf("%d" , &marks);

    if(marks <= 30){
        printf("Fail");

    }else{
        printf("Pass");
    }

    //for loop
    for(int i=0; i<= 100; i++){
        printf("%d \n" , i);
    }

    for(int i=0; i>= 50; i--){
        printf("%d \n" , i );
    }

    for(float i=1.0; i<=5.0 ; i++){
        printf("%f \n" , i);
    }

    //while loop
    int i=1;
    while(i <= 5){
        printf("Hello world");
    }

    //do while loop
    do{
        printf("%d \n" , i);
        i++;
    }while(i<= 1);


    //print natural value
    int n;
    printf("Enter n:");
    scanf("%d" , &n);

    int sum=0;
    for(int i=1; i<= n ; i++){
        sum= sum+i;
    }
    printf("Sum is %d" , sum);


    //ptint table of a numm input by the user
    int n;
    printf("Enter n:");
    scanf("%d" , &n);

    for(int i=1; i<=10; i++){
        printf("%d" , n*i );
    }

    //keep taking num as a input from user until user enters an odd num
    int n;
    do{
        printf("enter num:");
        scanf("%d" , &n);
        printf("%d" , n);

        if(n % 2 != 0){   //multiple of 7=> if(n % 7==0)
            break;
        }

    }while (1);

    //continue
    for(int i=1; i<=5 ; i++){
        if(i==3){
            continue;
        }
        printf("%d \n" , i);
    }

    //prinnt 1 to 10 num except 6
    for(int i=1; i<= 10; i++){
        if(i==6){
            continue;
        }
        printf("%d \n" , i);

    }

    //odd no
    for(int i=5; i<= 50; i++){
        if(i % 2 != 0){
            printf("%d \n" , i);

        }
    }

    //fact
    int n;
    printf("Enter  num:");
    scanf("%d" , &n);

    int fact=1;
    for(int i=1; i< =n ; i++){
        fact= fact * i;
    }
    printf("Factorial is: %d" , fact);


    //print in reverse 
    for(int i=10; i>=1 ; i--){
        printf("%d \n" , n* i);

    }

    //print sum of all numbers bet 5 to 50
    int sum=0;
    for(int i=5; i<= 50 ; i++){
        sum += i;
    }
    printf("Sum is: %d" , sum);


    









    return 0;
}