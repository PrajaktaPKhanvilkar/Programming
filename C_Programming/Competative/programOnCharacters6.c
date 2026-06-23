#include<stdio.h>
#include<stdbool.h>
char chkAlpha(char ch){
    char cRes = '\0';
    if(ch>=65 && ch<=90 ){
        cRes = ch+32;
    }else if(ch>=97 && ch<=122){
         cRes = ch-32;
    }else{
        cRes = ch;
    }
    return cRes;
}

int main(){
    char cValue = '\0';
    char cRet = '\0';
    printf("Enter a character\n");
    scanf("%c",&cValue);
    cRet = chkAlpha(cValue);
    printf("%c\n",cRet);
   
    return 0;
}