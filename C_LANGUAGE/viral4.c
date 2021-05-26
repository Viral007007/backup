#include<stdio.h>

void main()
{
    int n;
    printf("Enter the number :");
    scanf("%d",&n);

    int i;

    for(int i=1;i<=n;i++)
    {
        for (int j = 0; j < i ; j++)
        {               
            printf("*");
        }
        
       
        printf("\n");
    }
}