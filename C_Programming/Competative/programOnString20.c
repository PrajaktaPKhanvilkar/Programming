#include <stdio.h>
#include <stdbool.h>
void strCopyX(char *str, char *dest)
{
    int i =0,j=0;
    while(str[i] != '\0')
    {
         i++;
    }
     while(dest[j] != '\0')
    {
        str[i] = dest[j];
         j++;
    }
    str[i] = '\0'; 
}

int main()
{
    char Arr[50] = "Marvellous Infosystem";
    char Brr[30]="Logic Building";
    strCopyX(Arr, Brr);
    
    return 0;
}