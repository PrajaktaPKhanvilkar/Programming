#include<stdio.h>
int CountDiff(int iNo){
    int iCnt = 0;
    int OddCounter = 0;
    int EvenCounter = 0;
    if(iNo<0){
        iNo = -iNo;
    }
    while(iNo !=0){
       iCnt = iNo % 10;
        if(iCnt %2 != 0){
            OddCounter = OddCounter + iCnt;
        }else{
            EvenCounter = EvenCounter + iCnt;
        }
        iNo = iNo / 10;
    }
    return OddCounter - EvenCounter;
}

int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    iRet = CountDiff(iValue);
    printf("Difference between sum of odd and even digits is : %d\n",iRet);
    return 0;
}

//time complexity is O(N) where N is the number of digits in the input number