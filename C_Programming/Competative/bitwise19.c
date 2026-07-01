#include <stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;
//bit at 1st position or  2nd position is on or off
bool toggleBits(UINT iNo, UINT iPos1, UINT iPos2){
    UINT iMask1 = 0x1, iMask2 = 0x1, iMask = 0;
    bool bRes = false;
    if(iPos1<1 || iPos1>32 || iPos2<1 || iPos2>32){
        printf("Invalid Bit position\n");
        return false;
    }
    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);
    iMask = iMask1 | iMask2;
    if((iNo | iMask) == iMask){
        bRes = true;
    } else{
        bRes = false;
    }   
    return bRes;
}
int main()
{
    UINT iValue = 0, iLocation1 = 0,iLocation2 = 0;
    bool bRet=false;
    printf("Enter  Number:\n");
    scanf("%d", &iValue);
    printf("Enter first  Position:\n");
    scanf("%d", &iLocation1);
    printf("Enter second Position:\n");
    scanf("%d", &iLocation2);
    bRet = toggleBits(iValue,iLocation1, iLocation2);
    if(bRet == true){
        printf("%d or %d bits are on\n",iLocation1,iLocation2);
     } else{
        printf("%d or %d bits are off\n",iLocation1,iLocation2);
     }

    return 0;
}