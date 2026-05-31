#include<stdio.h>
void Display(int iNO){
  if(iNO<10){
    printf("Hello\n");
  }
  else{
    printf("Demo\n");
  }
}
int main(){
    int iValue = 0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    Display(iValue);
    return 0;
}   