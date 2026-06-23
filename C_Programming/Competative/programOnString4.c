#include <stdio.h>
#include<stdbool.h>
bool checkVowel(char *str)
{
    bool iRes = false;
    while (*str != '\0')
    {
        if (*str >= 'a' || *str <= 'e' || *str <= 'i' || *str <= 'o' || *str <= 'u' ||
        *str >= 'A' || *str <= 'E' || *str <= 'I' || *str <= 'O' || *str <= 'U' )
        {
            iRes = true;
        }
        str++;
    }
    return iRes;
}

int main()
{
    char Arr[20] = {'\0'};
    bool bRet = false;
    printf("Enter a String\n");
    scanf("%[^'\n']s", Arr);
    bRet = checkVowel(Arr);
    if(bRet== true){
        printf("String contains Vowels\n");
    }else{
         printf("String does not contain Vowels\n");
    }
    
    return 0;
}