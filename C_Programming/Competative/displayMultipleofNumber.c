#include<stdio.h>

void DisplayMultiple(int iNo){
    int iCnt = 0;
    int iMultiple = 0;
    for(iCnt = 1; iCnt <= 5; iCnt++){
        iMultiple = iCnt * iNo;
        printf("%d\t",iMultiple);
    }
}

int main(){
    int iValue =0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayMultiple(iValue);
    return 0;
}