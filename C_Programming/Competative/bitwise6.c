
#include <stdio.h>
typedef unsigned int UINT;

UINT OffBit(UINT iNo){
    UINT iMask = 0X40;
    UINT iRes = 0;
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