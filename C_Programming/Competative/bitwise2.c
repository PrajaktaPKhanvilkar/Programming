#include <stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;
// bit  5th and 18th 
bool CheckBit(UINT iNo)
{
    UINT iAns =0;
    UINT iMask1 = 0X20000;
    UINT iMask2 = 0x10;
    UINT iMask = 0;
    iMask = iMask1 | iMask2;
    iAns = iNo & iMask;
     if(iAns == iMask){
        return true;
     } else{
        return false;
     }  
}
int main()
{
    UINT iNo = 0, iAns =0;
    bool bRet = false;
    printf("Enter  Number:\n");
    scanf("%d", &iNo);
    bRet = CheckBit(iNo);
    if(bRet == true){
        printf("5th and 18th bits are on\n");
     } else{
        printf("5th and 18th bits are off\n");
     }  
    
    return 0;
}
