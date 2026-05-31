#include<stdio.h>
typedef int bool;
#define true 1
#define false 0
bool checkZero(int iNo)
{
    int iDigit = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 0)
        {
            return true;
        }
        iNo = iNo / 10;
    }
    return false;
}

int main()
{
    int iValue = 0;
    bool bResult = false ;

    printf("Enter a number : \n");
    scanf("%d", &iValue);
    bResult = checkZero(iValue);
    if(bResult)
    {
        printf("Zero is present in the number\n");
    }
    else
    {
        printf("Zero is not present in the number\n");
    }

    return 0;
}