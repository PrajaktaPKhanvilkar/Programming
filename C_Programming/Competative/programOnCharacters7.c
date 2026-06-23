#include<stdio.h>
#include<stdbool.h>
void Display(char ch){
    char i='\0';
    if(ch>=65 && ch<=90 ){
        for(i = ch; i<=90;i++){
            printf("%c\t",i);
        }
    }else if(ch>=97 && ch<=122){
       for(i = ch; i<=122;i++){
            printf("%c\t",i);
        }
    }
    printf("\n");

}

int main(){
    char cValue = '\0';
    printf("Enter a character\n");
    scanf("%c",&cValue);
     Display(cValue);
    return 0;
}