#include<stdio.h>

void Table(int iNo){
    int iCnt = 0;
    int iMultiple = 0;
    for(iCnt = 1; iCnt <= 10; iCnt++){
        iMultiple = iCnt * iNo;
        printf("%d\t",iMultiple);
    }
}

int main(){
    int iValue =0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    Table(iValue);
    return 0;
}

//time complexity is O(1)