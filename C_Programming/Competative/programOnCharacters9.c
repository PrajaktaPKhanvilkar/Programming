#include<stdio.h>
#include<stdbool.h>
void  Display(char ch){
    
        printf("Decimal Value : %d\n",ch);
        printf("Hexa Decimal Value: %X\n",ch);
        printf("Octa Value:%o\n",ch);
    
}

int main(){
    char cValue = '\0';
    printf("Enter character\n");
    scanf("%c",&cValue);
    Display(cValue);
       
    return 0;
}