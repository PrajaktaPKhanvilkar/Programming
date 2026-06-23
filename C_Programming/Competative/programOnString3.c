#include <stdio.h>
int Difference(char *str)
{
    int iCout = 0, iCount = 0;
    while (*str != '\0')
    {
        if (*str >= 'a' && *str <= 'z')
        {
            iCout++;
        }
        else if (*str >= 'A' && *str <= 'Z')
        {
            iCount++;
        }
        str++;
    }
    return iCout- iCount;
}

int main()
{
    char Arr[20] = {'\0'};
    int iRet = 0;
    printf("Enter a String\n");
    scanf("%[^'\n']s", Arr);
    iRet = Difference(Arr);
    printf("%d\n", iRet);
    return 0;
}