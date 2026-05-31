#include<stdio.h>

int DistanceinMeter(int iNo){
    int iMeter = 0;
    iMeter = iNo * 1000;
    return iMeter;
}

int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a Distance in Kilometers :\n");
    scanf("%d",&iValue);
    iRet = DistanceinMeter(iValue);
    printf("Distance in Meters is : %d\n",iRet);
    return 0;
}
//time complexity is O(1)