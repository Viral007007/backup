#include<stdio.h>

struct student
{
    char name[15];
    int id;
    int marks;
};

void details(struct student s)
{
    printf("***Hello %s !!***\n",s.name);
    printf("you id is %d\n",s.id);
    printf("you marks is %d\n\n",s.marks);
}

void main()
{
    int n;
    printf("Enter the student count :");
    scanf("%d",&n);

    for(int i=1; i<=n;i++)
    {
        struct student s1;

        printf("Enter the student name :");
        scanf(" %s",&s1.name);
        printf("Enter student id :");
        scanf("%d",&s1.id);
        printf("Enter student marks :");
        scanf("%d",&s1.marks);

        details(s1);
    }
} 