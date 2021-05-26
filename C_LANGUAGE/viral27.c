#include<stdio.h>

void main()
{
    int num;
    printf("Enter the number :");

    scanf("%d",&num);

    for (int i=2; i<=num ; i++ )
    {
        for(int j=2 ; j<=i; j++)
        {
            if (i%j == 0)
            {
                if( i == j)
                {
                    printf("The number %d is PRIME !\n",i);
                    break;
                }
                if ( i != j)
                {
                    break;
                }
            }
        }
    }
}