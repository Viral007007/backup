#include<stdio.h>
/* 0   1   1   2 3 5 8 13  
   a   b   a+b
       a    b a+b   
            a  b a+b*/

void main()
{
    int num,a,b,c;
    printf("Enter the number :");
    scanf("%d",&num);
    a=0;
    b=1;
    for (int i = 0; a <= num; i++)
    {
        if (a==0)
        {
            printf("%d",a);
            printf("\n");
        }
        if (a==1)
        {
            printf("%d",a);
            printf("\n");
        }
        if(a>1)
        {
            printf("%d",a);
            printf("\n");            
        }
        c = a;
        a = b;
        b = b + c;
        
    }
    
}