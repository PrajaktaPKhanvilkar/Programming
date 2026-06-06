#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>


bool LinearSearch(int Arr[], int iSize){
    int iCnt = 0;
    bool iResult = false;
    for(iCnt = 0; iCnt < iSize; iCnt++){
        if(Arr[iCnt] == 11){
            iResult = true;
            break;
        }
    }
    return iResult;
}

int main(){
    int iLength = 0, iCnt = 0;
    int *Brr = NULL;
    bool bRet = false;

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);
    Brr = (int *)malloc(iLength * sizeof(int));
    printf("Enter %d elements : \n", iLength);
    for(iCnt = 0; iCnt < iLength; iCnt++){
        scanf("%d", &Brr[iCnt]);
    }

    bRet = LinearSearch(Brr, iLength);
    if(bRet == true){
        printf("Element is Present\n");
    }
    else{
        printf("Element is Not Present\n");
    }
    free(Brr);
    return 0;
}

//Time Complexity : O(N)