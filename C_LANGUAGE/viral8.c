#include<stdio.h>

void main()
{
    int n;
    int count;
    printf("Enter the number :");
    scanf("%d",&n);
    count = n;

    for(int i=1; i<=n+1 ; i++ )
    {

        for (int k=1;k<=count;k++)
        {
            printf(" ");
        }
        count--;

        for(int j=1; j<=n; j++)
        {
            printf("*");
        }

        printf("\n");
    }

}