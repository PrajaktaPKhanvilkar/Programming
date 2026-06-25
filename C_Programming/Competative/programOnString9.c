#include<stdio.h>
void DisplayDigits(char *str){
     char *read_ptr = str; 
    char *write_ptr = str;

    while (*read_ptr != '\0') {
        if (*read_ptr >= '0' && *read_ptr <= '9') {
            *write_ptr = *read_ptr;
            write_ptr++;
        }
        read_ptr++;
    }

    *write_ptr = '\0';
        printf("Digits:  %s\n",str);
}
int main(){
    char Arr[20];
    printf("Enter String\n");
    scanf("%[^'\n']s", Arr);
    DisplayDigits(Arr);


    return 0;
}

// time complexity 2N