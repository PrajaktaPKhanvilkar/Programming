#include <stdio.h>
#include <stdbool.h>
int firstChar(char *str, char ch)
{
    int i = 0;
    while (str[i] != '\0')
    {
        if (str[i] == ch)
        {
            return i;
        }
        i++;
    }

    return -1;
}

int main()
{
    char Arr[20];
    char cValue;
    int iRet = 0;
    printf("Enter a String\n");
     scanf("%[^\n]s", Arr);
    printf("Enter character to search");
    scanf(" %c", &cValue); 
    iRet = firstChar(Arr, cValue);
    printf("occurance index: %d", iRet);
    return 0;
}