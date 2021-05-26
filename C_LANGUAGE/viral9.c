#include<stdio.h>

void main()
{
    int n;
    printf("Enter the number :");
    scanf("%d",&n);

    int i=1;
    while (i<=n)
    {
        if (!(i%2))
        {
            printf("the number %d is not Prime\n",i);
        }
        if (i%2)
        {
            printf("the number %d is Prime\n",i);
        }
        i++;

    }


}