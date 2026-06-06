#include <stdio.h>
#include <stdlib.h>

int LargestNumber(int Arr[], int iSize)
{
    int iCnt = 0, iMax = 0;
    iMax = Arr[0];
    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        if (Arr[iCnt] > iMax)
        {
           iMax = Arr[iCnt];
        }
    }
    return iMax;
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

    iRet = LargestNumber(Brr, iLength);
    printf("Max number is %d\n", iRet);
    free(Brr);
    return 0;
}

// Time Complexity : O(N)