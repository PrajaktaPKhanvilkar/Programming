#include<stdio.h>

void DisplayNumber(int iNo){
    int iCnt = 0;
    if(iNo < 0){
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++){
        printf("%d\t",iCnt);
    }
}

int main(){
    int iValue =0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayNumber(iValue);
    return 0;
}