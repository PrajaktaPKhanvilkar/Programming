#include<stdio.h>
int RangeCount(int iNo){
    int iCnt = 0;
    int Counter = 0;
    if(iNo<0){
        iNo = -iNo;
    }
    while(iNo !=0){
        iCnt = iNo % 10;
        if(iCnt >= 3 && iCnt <= 7){
            Counter++;
        }
        iNo = iNo / 10;
    }
    return Counter;
}

int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    iRet = RangeCount(iValue);
    printf("Count of digits in range 3-7 is : %d\n",iRet);
    return 0;
}
//time complexity is O(N) where N is the number of digits in the input number