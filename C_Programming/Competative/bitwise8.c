#include <stdio.h>
typedef unsigned int UINT;

UINT toggleBits(UINT iNo){
    UINT iMask = 0x1, iRes = 0;
    iMask = iMask << 6;
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