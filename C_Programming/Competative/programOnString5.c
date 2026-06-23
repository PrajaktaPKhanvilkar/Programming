#include<stdio.h>
void strRevX(char *str){
    char *start= NULL, *end = NULL;
    char temp='\0';
    start = str;
    while (*str !='\0')
    {
        str++;
    }
    str--;
    end = str;
    while (start<end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
    
    // printf("\n");
}
int main(){
    char Arr[20];
    printf("Enter String\n");
    scanf("%[^'\n']s", Arr);
    strRevX(Arr);
    printf("Reverse String %s\n",Arr);

    return 0;
}

// time complexity 2N