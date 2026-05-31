#include<stdio.h>

void DisplayRange(int iStart, int iEnd)
{
    if(iStart > iEnd)
    {
        printf("Invalid Range\n");
        return;
    }
    for(int i = iStart; i <= iEnd; i++)
    {
        printf("%d ", i);
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter Starting Point : \n");
    scanf("%d", &iValue1);

    printf("Enter Ending Point : \n");
    scanf("%d", &iValue2);

    DisplayRange(iValue1, iValue2);

    return 0;
}