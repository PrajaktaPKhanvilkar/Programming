#include<stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL checkEven(int iNo){
   if(iNo%2==0){
       return TRUE;
   }
   else{
       return FALSE;
   }
}
int main(){
    int iValue = 0;
    BOOL bRet = FALSE;
    printf("Enter number\n");
    scanf("%d",&iValue);
    bRet = checkEven(iValue);
    if(bRet==TRUE){
        printf("%d is even\n",iValue);
    }
    else{
        printf("%d is odd\n",iValue);
    }
    return 0;
}   