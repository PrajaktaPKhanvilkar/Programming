#include<stdio.h>
#include<stdbool.h>
bool chkAlpha(char ch){
    bool bRes = false;
    if(ch>=48 && ch<=57 ){
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
        printf("Value is digit\n");
    }else{
        printf("Number is not digit\n");
    }
    return 0;
}