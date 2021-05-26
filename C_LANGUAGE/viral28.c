#include<stdio.h>

#define conat(a,b) a##b

void main()
{
    int xy = 25;
    printf("%d",conat(x,y));
}