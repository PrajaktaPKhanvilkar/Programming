#include<stdio.h>

int OddFact(int iNo){
    int Fact= 1;
    int iCnt = 0;
    if(iNo < 0){
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++){
        if(iCnt % 2 != 0){
            Fact = Fact * iCnt;
        }
    }
    return Fact;
}
int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    iRet = OddFact(iValue);
    printf("Multiplication of Odd factors is : %d\n",iRet);
    return 0;
}

//time complexity is O(N)