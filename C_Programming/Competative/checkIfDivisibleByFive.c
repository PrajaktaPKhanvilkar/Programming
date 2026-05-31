#include<stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL check(int iNo){
   if(iNo%5==0){
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
    bRet = check(iValue);
    if(bRet==TRUE){
        printf("%d is divisible by 5\n",iValue);
    }
    else{
        printf("%d is not divisible by 5\n",iValue);
    }
    return 0;
}   