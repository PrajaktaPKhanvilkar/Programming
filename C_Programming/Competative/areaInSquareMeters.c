#include<stdio.h>

float SqFttoSqM(int iNo){
    float iSquareMeter = 0;
    iSquareMeter = iNo * 0.092903;
    return iSquareMeter;
}

int main(){
    int iValue =0;
    float iRet = 0;
    printf("Enter an Area in Square Feet :\n");
    scanf("%d",&iValue);
    iRet = SqFttoSqM(iValue);
    printf("Area in Square Meters is : %.2f\n",iRet);
    return 0;
}
//time complexity is O(1)