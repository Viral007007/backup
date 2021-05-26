#include<stdio.h>

void main()
{
    int n;
    printf("Enter the number :");
    scanf("%d",&n);

    for(int i=2;i<=n;i++)
    {
        for (int j=2;j<=i;j++)
        {
            if (i%j==0)
            {
                if (i==j)
                {
                    printf("%d ---> prime\n",i);
                    break;
                }
                if (i!=j)
                {
                    printf("%d ---> not prime\n",i);
                    break;
                }
            }
        }
    }
}