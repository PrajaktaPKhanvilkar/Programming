
#include <stdio.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo){
    UINT iMask1 = 0X40;
    UINT iMask2 = 0X200;
    UINT iRes = 0;
    UINT iMask = 0;
    iMask = iMask1 | iMask2;
    iMask = ~iMask;
    iRes = iNo & iMask;
    return iRes;
}
int main()
{
    UINT iValue = 0, iLocation = 0, iRet=0;
    printf("Enter  Number:\n");
    scanf("%d", &iValue);
    iRet = OffBit(iValue);
    printf("Updated No: %d\n", iRet);

    return 0;
}