#include<stdio.h>
void strUpX(char *str){
    while (*str !='\0')
    {
        if (*str >= 'a' && *str <= 'z')
        {
            *str = *str - 32;
        }
        else  if (*str >= 'A' && *str <= 'Z')
        {
            *str = *str + 32;
        }
        str++;
    }
    // printf("\n");
}
int main(){
    char Arr[20];
    printf("Enter String\n");
    scanf("%[^'\n']s", Arr);
    strUpX(Arr);
    printf("Upper Case String:  %s\n",Arr);

    return 0;
}

// time complexity 2N