#include<stdio.h>

int DifferenceFact(int iNo){
    int Fact= 1;
    int Fact1 = 1;
    int iCnt = 0;
    if(iNo < 0){
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++){
        if(iCnt % 2 == 0){
            Fact = Fact * iCnt;
        } else {
            Fact1 = Fact1 * iCnt;
        }
    }
    return Fact - Fact1;
}
int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    iRet = DifferenceFact(iValue);
    printf("Difference of Even and Odd factors is : %d\n",iRet);
    return 0;
}

//time complexity is O(N)