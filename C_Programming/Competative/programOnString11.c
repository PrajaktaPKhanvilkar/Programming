#include <stdio.h>
#include<stdbool.h>
bool checkChar(char *str, char ch)
{
    bool iRes = false;
    while (*str != '\0')
    {
        if (*str == ch )
        {
            iRes = true;
        }
        str++;
    }
    return iRes;
}

int main()
{
    char Arr[20];
    char cValue;
    bool bRet = false;
   printf("Enter a String\n");
     scanf("%[^\n]s", Arr);
    printf("Enter character to search");
    scanf(" %c", &cValue); 
    bRet = checkChar(Arr,cValue);
    if(bRet== true){
        printf("Character found\n");
    }else{
         printf("Character not found\n");
    }
    
    return 0;
}