#include<stdio.h>

void TableRev(int iNo){
    int iCnt = 0;
    int iMultiple = 0;
    for(iCnt = 10; iCnt >= 1; iCnt--){
        iMultiple = iCnt * iNo;
        printf("%d\t",iMultiple);
    }
}

int main(){
    int iValue =0;
    printf("Enter a number :\n");
    scanf("%d",&iValue);
    TableRev(iValue);
    return 0;
}
//time complexity is O(1)