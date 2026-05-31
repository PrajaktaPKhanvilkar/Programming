//write a program which accepts one number from user and print that number of even numbers on screen 
#include <stdio.h>

void printEven(int iNo){
    if(iNo <=0){
        return;
    }
    int iCnt = 0;
    int iResult = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++){
           iResult = iCnt *2;
           printf("%d ",iResult);
    }
}
int main(){
    int iValue =0;
    printf("Enter Number: \n");
    scanf("%d",&iValue);
    printEven(iValue);
    return 0;
}