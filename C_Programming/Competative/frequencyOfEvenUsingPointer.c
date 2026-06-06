#include<stdio.h>
#include<stdlib.h>

int FrequencyOfEven(int Arr[], int iLength){
    int iCnt = 0, iResult = 0;
    for(iCnt = 0; iCnt < iLength; iCnt++){
        if(Arr[iCnt] % 2 == 0){
            iResult ++;
        }
    }
    return iResult;
}

int main(){
    int iSize = 0, iRet = 0, iCnt = 0;
    int *ptr = NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iSize);
    ptr = (int *)malloc(iSize * sizeof(int));
    if(ptr == NULL){
        printf("Unable to allocate memory\n");
        return -1;
    }
    printf("Enter %d elements : \n", iSize);
    for(iCnt = 0; iCnt < iSize; iCnt++){
        scanf("%d", &ptr[iCnt]);
    }

    iRet = FrequencyOfEven(ptr, iSize);
    printf("Frequency of even numbers is : %d\n", iRet);
    free(ptr);
    return 0;
}

//Time Complexity : O(N)