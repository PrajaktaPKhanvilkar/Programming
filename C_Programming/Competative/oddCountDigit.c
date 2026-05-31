#include<stdio.h>
int OddCount(int iNo){
    int iCnt = 0;
    int OddCounter = 0;
    if(iNo<0){
        iNo = -iNo;
    }
    while(iNo !=0){
       iCnt = iNo % 10;
        if(iCnt %2 != 0){
            OddCounter++;
        }
        iNo = iNo / 10;
    }
    return OddCounter;
}

int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    iRet = OddCount(iValue);
    printf("Count of Odd digits is : %d\n",iRet);
    return 0;
}

//time complexity is O(N) where N is the number of digits in the input number