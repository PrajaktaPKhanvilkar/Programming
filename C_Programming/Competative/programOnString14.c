#include <stdio.h>
#include <stdbool.h>
int lastChar(char *str, char ch)
{
    int i = 0;
    int last_index = -1;
    while (str[i] != '\0')
    {
        if (str[i] == ch)
        {
            last_index = i;
        }
        i++;
    }
    if(last_index != -1){
        return last_index;
    }else{
        return -1;    
    }
    
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
    iRet = lastChar(Arr, cValue);
    printf("occurance index: %d", iRet);
    return 0;
}