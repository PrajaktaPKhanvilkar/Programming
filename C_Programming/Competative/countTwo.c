#include<stdio.h>

int countTwo(int iNo)
{
    int iDigit = 0;
    int iCount = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 2)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }
    return iCount;
}


int main()
{
    int iValue = 0;
    int iResult = 0;

    printf("Enter a number : \n");
    scanf("%d", &iValue);
    iResult = countTwo(iValue);
    printf("Count of 2 in the number is: %d\n", iResult);
    return 0;
}