#include<stdio.h>
void Accept(int iNO){
    int iCnt = 0;
   while (iCnt<iNO)
   {
    printf("*");
    iCnt++;
   }
   
    
}
int main(){
    int iValue = 0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    Accept(iValue);
    return 0;
}   