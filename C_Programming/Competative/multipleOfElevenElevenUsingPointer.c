#include<stdio.h>
#include<stdlib.h>


int Display(int Arr[], int n) {
    int iCnt = 0;
    printf("\nMultiples of 11 are:\n");
    for (iCnt = 0; iCnt < n; iCnt++) {
        if (Arr[iCnt] %11 == 0) { // Check if the number is divisible by 11
            printf("%d ", Arr[iCnt]);
        }
    }
    printf("\n");
}

int main(){
    int iSize = 0, iCnt = 0;
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

    Display(ptr, iSize);
    free(ptr);
    return 0;
}

//Time Complexity : O(N)