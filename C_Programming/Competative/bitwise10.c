#include <stdio.h>
typedef unsigned int UINT;
// toggle 1st 4 bits make them on 
UINT toggleBits(UINT iNo){
    UINT iMask = 0x0F, iRes = 0;
    iRes = iNo | iMask;

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