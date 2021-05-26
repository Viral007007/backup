#include<stdio.h>

void main()
{
    int a = 0;
    int b = 1;
    int c,n;

    printf("Enter the count of term :");
    scanf("%d",&n);

    for (int i=0; i<n; i++ )
    {
        if (i==0) printf("0 ");
        if (i==1) printf("1 ");
        if (i>=2)
        {
            c = a+b;
            a = b;
            b = c;
            printf("%d ",c);
        }
    }
}