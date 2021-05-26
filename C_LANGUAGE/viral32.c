/*

0  1   1   2   3  5  8  13  21.....
a  b  a+b  |   |
   a   b  a+b  |
       a   b  a+b

*/

#include<stdio.h>

void main()
{
    int a,b,c,num;
    c=0;
    a=0;
    b=1;

    printf("Enter the number :");
    scanf(" %d",&num);

    for (int i = 0; a < num; i++)
    {
        printf("%d\t",a);

        c=a;
        a=b;
        b=b+c;
    }
    
}