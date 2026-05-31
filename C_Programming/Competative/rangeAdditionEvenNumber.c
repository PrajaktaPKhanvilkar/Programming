#include<stdio.h>

int DisplayRange(int iStart, int iEnd)
{
    int iSum = 0;
    if(iStart > iEnd && iStart < 0 && iEnd < 0)
    {
        printf("Invalid Range\n");
        return 0;
    }
    for(int i = iStart; i <= iEnd; i++)
    {
        if(i % 2 == 0){
            iSum = iSum + i;
        }
    }
    return iSum;
}

int main()
{
    int iValue1 = 0, iValue2 = 0, iResult = 0;

    printf("Enter Starting Point : \n");
    scanf("%d", &iValue1);

    printf("Enter Ending Point : \n");
    scanf("%d", &iValue2);

    iResult = DisplayRange(iValue1, iValue2);
    printf("Sum of numbers in the range is: %d\n", iResult);

    return 0;
}