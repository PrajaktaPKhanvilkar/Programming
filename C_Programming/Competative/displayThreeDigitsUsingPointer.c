#include<stdio.h>
#include<stdlib.h>
void DisplayDigits(int Arr[], int iSize)
{
    int iCnt = 0;
    printf("Elements having three digits are: \n");
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] >= 100) && (Arr[iCnt] <= 999))
        {
            printf("%d\n", Arr[iCnt]);
        }
    }

}
int main()
{
    int iLength = 0, iCnt = 0;
    int *Brr = NULL;
    

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);
    Brr = (int *)malloc(iLength * sizeof(int));
    printf("Enter %d elements : \n", iLength);
    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &Brr[iCnt]);
    }

    DisplayDigits(Brr, iLength);
    free(Brr);
    return 0;
}