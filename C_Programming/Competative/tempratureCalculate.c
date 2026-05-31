#include<stdio.h>

int FhtoCs(int iNo){
    int iCelsius = 0;
    iCelsius = (iNo - 32) * 5/9;
    return iCelsius;
}

int main(){
    int iValue =0;
    int iRet = 0;
    printf("Enter a Temperature in Fahrenheit :\n");
    scanf("%d",&iValue);
    iRet = FhtoCs(iValue);
    printf("Temperature in Celsius is : %d\n",iRet);
    return 0;
}
//time complexity is O(1)