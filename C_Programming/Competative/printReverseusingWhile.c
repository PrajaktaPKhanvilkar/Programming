#include<stdio.h>
void Accept(int iNO){
   while (iNO>0)
   {
    printf("*");
    iNO--;
   }
   
    
}
int main(){
    int iValue = 0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    Accept(iValue);
    return 0;
}   