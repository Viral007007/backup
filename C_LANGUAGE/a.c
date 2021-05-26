/* P to print digits of given number
   Eg -97839
   outpu-> 9
           7
           8
           3
           9
1. Scan the number which is entered by the usr to know the number of places .
2. scan using loop.
3. Another loop to divide the number by 10^(n-1) to print the number .
*/

#include <stdio.h>
#include <math.h>
int main()
{
    int num = 0, m, c, backup = 0, q;
    printf("Enter the number:");
    scanf("%d", &num);
    c = 0;
    backup = num;
    while (num != 0)
    {
        ++c;
        num = num / 10;
    }
    num = backup;
    int i = pow(10, c - 1);
    while (i != 0)
    {
        m = num / i;
        m = m % 10;
        printf("  %d", m);
        i /= 10;
    }

    return 0;
}
