#include <stdio.h>
#include<stdbool.h>
int countChar(char *str, char ch)
{
    int iRes = 0;
    while (*str != '\0')
    {
        if (*str == ch )
        {
            iRes++;
        }
        str++;
    }
    return iRes;
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
    iRet = countChar(Arr,cValue);
    printf("frequency is %d", iRet);
    return 0;
}