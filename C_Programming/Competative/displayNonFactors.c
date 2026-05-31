// write a program which accepts number from user and display its multiplication of factors

#include<stdio.h>
void DisplayNoNFactors(int iNo){
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++){
        if(iNo % iCnt != 0){
            printf("%d\t",iCnt);
        }
    }
}
int main(){
    int iValue = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayNoNFactors(iValue);
    return 0;
}