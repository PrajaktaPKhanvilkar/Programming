#include <stdio.h>
#include <stdlib.h>

int DifferenceBetweenNumbers(int Arr[], int iSize)
{
    int iCnt = 0, iMin = 0, iMax = 0; 
    iMin = Arr[0];
    iMax = Arr[0];
    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        if (Arr[iCnt] < iMin)
        {
           iMin = Arr[iCnt];
        }
        if (Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }
    return iMax - iMin;
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

    iRet = DifferenceBetweenNumbers(Brr, iLength);
    printf("Difference between largest and smallest number is %d\n", iRet);
    free(Brr);
    return 0;
}

// Time Complexity : O(N)