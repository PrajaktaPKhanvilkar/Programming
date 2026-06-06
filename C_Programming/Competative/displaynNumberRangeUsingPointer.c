#include<stdio.h>
#include<stdlib.h>


int LinearSearch(int Arr[], int iSize, int iStart, int iEnd){
    int iCnt = 0;
    int iResult = -1;
    printf("Elements between %d and %d are: \n", iStart, iEnd);
    for(iCnt = 0; iCnt < iSize; iCnt++){
        if(Arr[iCnt]>=iStart && Arr[iCnt]<=iEnd){
            printf("%d\n", Arr[iCnt]);
        }
    }
    return iResult;
}

int main(){
    int iLength = 0, iCnt = 0, iStart = 0, iEnd = 0;
    int *Brr = NULL;
    int iRet = 0;

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);
    printf("Enter starting element : \n");
    scanf("%d", &iStart);
    printf("Enter ending element : \n");
    scanf("%d", &iEnd);
    Brr = (int *)malloc(iLength * sizeof(int));
    printf("Enter %d elements : \n", iLength);
    for(iCnt = 0; iCnt < iLength; iCnt++){
        scanf("%d", &Brr[iCnt]);
    }
    LinearSearch(Brr, iLength, iStart, iEnd);
   
    free(Brr);
    return 0;
}

//Time Complexity : O(N)