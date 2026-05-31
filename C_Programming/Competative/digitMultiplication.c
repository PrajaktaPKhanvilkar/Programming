#include<stdio.h>

int MultiplicationDigit(int iNo){
    int iMult = 1;
    int iCnt = 0;
    if(iNo<0){
        iNo = -iNo;
    }
    while(iNo!=0){
        iCnt = iNo %10;
        iMult = iMult * iCnt;
        iNo =iNo/10;
    }
    return iMult;
}

int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter a Number\n");
    scanf("%d",&iValue);

    iRet = MultiplicationDigit(iValue);
    printf("Multiplication of %d is: %d\n",iValue,iRet);
    return 0;
}
//time complexity is O(N) where N is the number of digits in the input number