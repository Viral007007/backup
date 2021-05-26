#include<stdio.h>

void main()
{
    int n;
    int m;

    printf("Enter the number :");
    scanf("%d",&n);
    m=n;

    for (int i=1;i<n;i++)
    {
        for(int j=1;j<m;j++)
        {
            printf("*");
        }
        m--;

        for (int j=1; j<=i;j++)
        {
            printf("#");
        }
        printf("\n");
        
    }

}
