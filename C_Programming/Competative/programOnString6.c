#include<stdio.h>
void strLwrX(char *str){
    while (*str !='\0')
    {
        if (*str >= 'A' && *str <= 'Z')
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
    strLwrX(Arr);
    printf("Lower Case String:  %s\n",Arr);

    return 0;
}

// time complexity 2N