#include<stdio.h>
#include<stdbool.h>
bool chkAlpha(char ch){
    bool bRes = false;
    if(ch>=97 && ch<=122){
        bRes = true;
    }
    return bRes;
}

int main(){
    char cValue = '\0';
    bool bRet = false;
    printf("Enter a character\n");
    scanf("%c",&cValue);
    bRet = chkAlpha(cValue);
    if(bRet == true){
        printf("Value is a small alphabet\n");
    }else{
        printf("Value is capital alphabet\n");
    }
    return 0;
}