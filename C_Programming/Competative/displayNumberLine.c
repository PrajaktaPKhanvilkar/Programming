#include<stdio.h>

void DisplayNegToPos(int iNo){
    int iCnt = 0;
    for(iCnt = -iNo; iCnt <= iNo; iCnt++){
        printf("%d\t",iCnt);
    }
}

int main(){
    int iValue =0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayNegToPos(iValue);
    return 0;
}