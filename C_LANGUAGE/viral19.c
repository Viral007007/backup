#include<stdio.h>
#include<string.h>

struct book
{
    char title[10];
};


void main()
{
    struct book book1;    
    printf("Enter book title :");
    scanf("%s",&book1.title);
    printf("book title is : %s",book1.title);
}