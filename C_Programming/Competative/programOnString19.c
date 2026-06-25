#include <stdio.h>
#include <stdbool.h>
void strCopyX(char *str, char *dest)
{
    while(*str != '\0')
    {
        if (*str >= 'a' && *str <= 'z')
        {
            *dest = *str;
            dest++;  
        }
         str++;
    }
}

int main()
{
    char Arr[20];
    char Brr[20];
    printf("Enter a String\n");
    scanf("%[^\n]s", Arr);
    strCopyX(Arr, Brr);
    printf("copied Capital Char: %s\n", Brr);
    return 0;
}