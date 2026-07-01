#include <stdio.h>
#include<stdbool.h>
typedef unsigned int UINT;
bool CheckBit(UINT iNo)
{
    UINT iAns =0;
    UINT iMask = 0x8000;
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
        printf("15th bit is on\n");
     } else{
        printf("15th bit is off\n");
     }  
    
    return 0;
}
