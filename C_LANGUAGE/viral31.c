// 1-2+3-4+5-6......

#include<stdio.h>

void main()
{
    int n;
    int sign = -1,sum = 0;
    printf("Enter the number :");
    scanf("%d",&n);

    int i=1;
    while(i<=n)
    {
        sign = sign * (-1);
        sum = sum + ( i * sign);
        i = i + 1;

    }
    printf("%d",sum);
}