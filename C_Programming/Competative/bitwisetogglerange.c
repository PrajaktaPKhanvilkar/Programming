#include <stdio.h>
typedef unsigned int UINT;
// toggle all bits from the range between ipos1 to ipos2
UINT toggleBits(UINT iNo, UINT iPos1, UINT iPos2)
{
    UINT iMask1 = 0x1, iMask2 = 0x1, iMask = 0, iRes = 0;
    if (iPos1 > iPos2)
    {
        int temp = iPos1;
        iPos1 = iPos2;
        iPos2 = temp;
    }

    if (iPos1 < 0 || iPos2 > 31)
    {
        printf("Positions must be between 0 and 31.\n");
        return 1;
    }
    iMask = ((1U << (iPos2 - iPos1 + 1)) - 1) << iPos1;
    if (iPos2 - iPos1 == 31)
    {
        iMask = 0xFFFFFFFF;
    }
    iRes = iNo ^ iMask;

    return iRes;
}
int main()
{
    UINT iValue = 0, iLocation1 = 0, iLocation2 = 0, iRet = 0;
    printf("Enter  Number:\n");
    scanf("%d", &iValue);
    printf("Enter first  Position:\n");
    scanf("%d", &iLocation1);
    printf("Enter second Position:\n");
    scanf("%d", &iLocation2);
    iRet = toggleBits(iValue, iLocation1, iLocation2);
    printf("Updated No: %d\n", iRet);

    return 0;
}