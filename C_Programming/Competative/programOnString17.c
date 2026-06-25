#include <stdio.h>
#include <stdbool.h>
void strCopyX(char *str, char *dest, int icnt)
{
    while ((*str != '\0')&& (icnt !=0))
    {
        *dest = *str;
        str++;
        dest++;
        icnt--;
    }
    
}

int main()
{
    char Arr[20];
    char Brr[20];
    printf("Enter a String\n");
     scanf("%[^\n]s", Arr);
    strCopyX(Arr, Brr,10);
    printf("copied string: %s\n", Brr);
    return 0;
}