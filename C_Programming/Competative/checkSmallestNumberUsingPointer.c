#include <stdio.h>
#include <stdlib.h>

int SmallestNumber(int Arr[], int iSize)
{
    int iCnt = 0, iMin = 0;
    iMin = Arr[0];
    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        if (Arr[iCnt] < iMin)
        {
           iMin = Arr[iCnt];
        }
    }
    return iMin;
}

int main()
{
    int iLength = 0, iCnt = 0, iRet = 0;
    int *Brr = NULL;
    

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);
    Brr = (int *)malloc(iLength * sizeof(int));
    printf("Enter %d elements : \n", iLength);
    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &Brr[iCnt]);
    }

    iRet = SmallestNumber(Brr, iLength);
    printf("Minimum number is %d\n", iRet);
    free(Brr);
    return 0;
}

// Time Complexity : O(N)