#include<stdio.h>

void main()
{
    int num;
    printf("Enter the number :");
    scanf("%d",&num);

    for (int i =2; i<=num ; i++)
    {
        if (num%i == 0)
        {
            if(num == i)
            {
                printf("The number is PRIME !");
                break;
            }
            if(i != num)
            {
                printf("The number is NOT PRIME");
                break;
            }
        }
    }   
}