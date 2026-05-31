// write a program which accepts number from user and display its multiplication of factors

#include<stdio.h>
void DisplayFactorsMultiplication(int iNo){
    int iCnt = 0;
    int iMult = 1;
    for(iCnt = 1; iCnt <= iNo/2; iCnt++){
        if(iNo % iCnt == 0){
            iMult = iMult * iCnt;
        }
    }
    printf("Multiplication of factors is : %d\n",iMult);
}
int main(){
    int iValue = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    DisplayFactorsMultiplication(iValue);
    return 0;
}