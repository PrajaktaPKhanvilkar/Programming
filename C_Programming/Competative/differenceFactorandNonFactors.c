// write a program which accepts number from user and display its multiplication of factors

#include<stdio.h>
int DifferenceSum(int iNo){
    int iCnt = 0;
    int iSum =0;
    int iSum1 = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++){
        if(iNo % iCnt == 0){
            iSum = iSum + iCnt;
        }else{
            iSum1 = iSum1 + iCnt;
        }
    }
    return iSum - iSum1;

}
int main(){
    int iValue = 0;
    int iRet = 0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    iRet = DifferenceSum(iValue);
    printf("Difference of sums is : %d\n",iRet);
    return 0;
}