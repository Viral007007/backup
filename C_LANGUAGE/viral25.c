#include<stdio.h>

void main()
{
    int x;
    printf("\n");

    //file open
    FILE * fp = NULL;
    fp = fopen("test.txt","a+");
    
    //reading a file    
    char readed[200];
    fgets(readed , 150, fp);
    printf("%s\n",readed);

    //writing a file
    char arr[100]="this is somthing";
    fprintf(fp,"%s",arr);    
    

    //file closed
    x = fclose(fp);
    if (x)
    {

        printf("your file has been closed \n");
        printf("Exit status %d",x);
    }
    else
    {
        printf("your file is not close");
    }

}