#include <stdio.h>
typedef unsigned int UINT;

UINT toggleBits(UINT iNo){
    UINT iMask1 = 0x1, iMask2 = 0x1, iMask = 0, iRes = 0;
    iMask1 = iMask1 << 6;
    iMask2 = iMask2 << 9;
    iMask = iMask1 | iMask2;
    iRes = iNo ^ iMask;
    return iRes;
}
int main()
{
    UINT iValue = 0, iLocation1 = 0,iLocation2 = 0, iRet=0;
    printf("Enter  Number:\n");
    scanf("%d", &iValue);
    iRet = toggleBits(iValue);
    printf("Updated No: %d\n", iRet);

    return 0;
}