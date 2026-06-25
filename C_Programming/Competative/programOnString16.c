#include <stdio.h>
#include <stdbool.h>
void strCopyX(char *str, char *dest)
{
    while (*str != '\0')
    {
        *dest = *str;
        str++;
        dest++;
    }
    
}

int main()
{
    char Arr[20];
    char Brr[20];
    printf("Enter a String\n");
     scanf("%[^\n]s", Arr);
    strCopyX(Arr, Brr);
    printf("copied string: %s", Brr);
    return 0;
}