#include<stdio.h>
#include<stdbool.h>
bool chkSpecial(char ch){
    bool bRes = false;
    if((ch >= 33 && ch<= 47) || (ch >= 58 && ch<= 64) ||
             (ch >= 91 && ch<= 96) ||(ch >= 123 && ch<= 126)){
        bRes = true;
    }
    return bRes;
}

int main(){
    char cValue = '\0';
    bool bRet = false;
    printf("Enter a character\n");
    scanf("%c",&cValue);
    bRet = chkSpecial(cValue);
    if(bRet == true){
        printf("It is special Character\n");
    }else{
        printf("It is not special Character\n");
    }
    return 0;
}