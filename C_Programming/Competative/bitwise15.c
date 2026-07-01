#include <stdio.h>
typedef unsigned int UINT;

UINT toggleBits(UINT iNo, UINT iPos){
    UINT iMask = 0xf000000f, iRes = 0;
    if(iPos<1 || iPos>32){
        printf("Invalid Bit position\n");
        return iNo;
    }
    iRes = iNo ^ iMask;
    return iRes;
}
int main()
{
    UINT iValue = 0, iLocation = 0, iRet=0;
    printf("Enter  Number:\n");
    scanf("%d", &iValue);
    printf("Enter  Position:\n");
    scanf("%d", &iLocation);
    iRet = toggleBits(iValue,iLocation);
    printf("Updated No: %d\n", iRet);

    return 0;
}