#include<stdio.h>

void main()
{
    int a,b,c;
    printf("Enter the value of A :");
    scanf("%d",&a);
    printf("\nEnter the value of B :");
    scanf("%d",&b);
    printf("\nEnter the value of C :");
    scanf("%d",&c);
    printf("\n");

    ( (a>b)&&(a>c) ) ? printf("A is muximum") : ( (b>a)&&(b>c) ? printf("B is muximum") : printf("C is muximum") )  ;




}
