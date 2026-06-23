#include<stdio.h>
#include<stdbool.h>
bool chkAlpha(char ch){
    bool bRes = false;
    if(ch>=65 && ch<=90 ){
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
        printf("Value is capital alphabet\n");
    }else{
        printf("value is small alphabet\n");
    }
    return 0;
}