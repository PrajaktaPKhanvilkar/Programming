#include<stdio.h>
#include<stdlib.h>

int countEleven(int Arr[],int iSize,int iNumber){
    int iCount=0, iCnt = 0;
    for(iCnt = 0; iCnt<iSize;iCnt++){
        if(Arr[iCnt] == iNumber){
            iCount++;
        }
    }
    return iCount;
}

int main(){
    int iLength = 0,iCnt = 0, iRet =0, iNumber = 0;
    int *Brr = NULL;
    printf("Enter the number of Element:\n");
    scanf("%d",&iLength);
    Brr =(int *)malloc(sizeof(int)*iLength);
    printf("Enterthe Numbers\n");
    for(iCnt = 0; iCnt<iLength;iCnt++){
        scanf("%d",&Brr[iCnt]);
    }
    printf("Enter the Number to check frequency");
    scanf("%d",&iNumber);
    iRet = countEleven(Brr,iLength,iNumber);
    printf("frequency of %d is: %d\n",iNumber, iRet);
    
    free(Brr);
    return 0;
}