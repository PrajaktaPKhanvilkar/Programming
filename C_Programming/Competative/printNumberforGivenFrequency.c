#include<stdio.h>
void Display(int iNO, int iFreq){
  int iCnt =0;
  for(iCnt=0;iCnt<iFreq;iCnt++){
    printf("%d ",iNO);
  }
}
int main(){
    int iValue = 0;
    int iCount = 0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    printf("Enter frequency\n");
    scanf("%d",&iCount);
    Display(iValue,iCount);

    return 0;
}   