// write a program which accepts number from user and display its multiplication of factors

#include<stdio.h>
void DisplayFactors(int iNo){
    int iCnt = 0;
    for(iCnt = iNo/2; iCnt >1; iCnt--){
        if(iNo % iCnt == 0){
            printf("%d\t",iCnt);
        }
    }
}
int main(){
    int iValue = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayFactors(iValue);
    return 0;
}