#include<stdio.h>

void DisplayPateern(int iNo){
    int iCnt = 0;
    if(iNo < 0){
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++){
        printf("$\t*\t");
    }
}

int main(){
    int iValue =0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayPateern(iValue);
    return 0;
}