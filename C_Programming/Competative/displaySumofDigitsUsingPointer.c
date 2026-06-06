#include<stdio.h>
#include<stdlib.h>
void DisplayDigits(int Arr[], int iSize)
{
    int iCnt = 0;
    int temp = 0, digit = 0, sum = 0;
    printf("Elements having three digits are: \n");
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        temp = Arr[iCnt]; // Keep original number for display
     
        if (temp < 0) temp = -temp;

        while(temp > 0) {
            digit = temp % 10; // Get the last digit
            sum = sum + digit; // Add it to sum
            temp = temp / 10;  // Remove the last digit
        }

        printf("Sum of digits of %d is: %d\n", Arr[iCnt], sum);
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