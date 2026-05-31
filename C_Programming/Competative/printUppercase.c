#include<stdio.h>
#include<ctype.h>

void Display(char cValue){
    char cChar = '\0';
    if(cValue >= 'A' && cValue <= 'Z'){
        cChar = tolower((unsigned char)cValue);
    }
    else if(cValue >= 'a' && cValue <= 'z'){
        cChar = toupper((unsigned char)cValue);
    }
    if(cChar != '\0'){
        printf("Converted character: %c\n", cChar);
    } else {
        printf("Not an alphabetic character.\n");
    }
}
int main(){
    char cValue = 0;
    printf("Enter Character: \n");
    scanf("%c",&cValue);
    Display(cValue);
    return 0;
}