#include<stdio.h>

int USDollar(int iNo){
    int iUSD = 0;
    iUSD = iNo * 70;
    return iUSD;
}

int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a Amount :\n");
    scanf("%d",&iValue);
    iRet = USDollar(iValue);
    printf("USDollar of %d is : %d\n",iValue,iRet);
    return 0;
}
//time complexity is O(1)