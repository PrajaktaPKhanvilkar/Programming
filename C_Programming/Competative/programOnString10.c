#include <stdio.h>
int countSpace(char *str)
{
    int iCout = 0;
    while (*str != '\0')
    {
        if (*str == ' ')
        {
            iCout++;
        }
        str++;
    }
    return iCout;
}

int main()
{
    char Arr[20] = {'\0'};
    int iRet = 0;
    printf("Enter a String\n");
    scanf("%[^'\n']s", Arr);
    iRet = countSpace(Arr);
    printf("%d\n", iRet);
    return 0;
}