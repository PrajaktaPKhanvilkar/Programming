#include <stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;

bool toggleBits(UINT iNo, UINT iPos){
    UINT iMask = 0, iRes = 0;
    if(iPos<1 || iPos>32){
        printf("Invalid Bit position\n");
        return iNo;
    }
    iMask = iMask << (iPos - 1);
    iRes = iNo & iMask;
    if(iRes == iMask){
        return true;
    } else{
        return false;
    }
}
int main()
{
    UINT iValue = 0, iLocation = 0;
    bool bRet = false;
    printf("Enter  Number:\n");
    scanf("%d", &iValue);
    printf("Enter  Position:\n");
    scanf("%d", &iLocation);
    bRet = toggleBits(iValue,iLocation);
    if(bRet == true){
        printf("%d bit is on\n",iLocation);
     } else{
        printf("%d bit is off\n",iLocation);
     }

    return 0;
}