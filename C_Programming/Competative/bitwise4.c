#include <stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;
// bit 7th 8th and 9th
bool CheckBit(UINT iNo)
{
    UINT iAns =0;
      UINT iMask1 = 0x40;   
      UINT iMask2 = 0x80;
      UINT iMask3 = 0x100; 
    UINT iMask = 0;
    iMask = iMask1 | iMask2 | iMask3;
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
        printf("7th, 8th and 9th bits are on\n");
     } else{
        printf("7th, 8th and 9th bits are off\n");
     }  
    
    return 0;
}
