#include<stdio.h>
#include<stdlib.h>


int LinearSearch(int Arr[], int iSize, int iNo){
    int iCnt = 0;
    int iResult = -1;
    for(iCnt = iSize - 1; iCnt >= 0; iCnt--){
         if (Arr[iCnt] == iNo) {
            iResult = iCnt;
            break; 
        }
    }
    return iResult;
}

int main(){
    int iLength = 0, iCnt = 0, iValue = 0;
    int *Brr = NULL;
    int iRet = 0;

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);
    Brr = (int *)malloc(iLength * sizeof(int));
    printf("Enter %d elements : \n", iLength);
    for(iCnt = 0; iCnt < iLength; iCnt++){
        scanf("%d", &Brr[iCnt]);
    }

    printf("Enter element to search : \n");
    scanf("%d", &iValue);

    iRet = LinearSearch(Brr, iLength, iValue);
    printf("Element is Present at index: %d\n", iRet);
   
    free(Brr);
    return 0;
}

//Time Complexity : O(N)