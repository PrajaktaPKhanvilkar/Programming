#include <stdio.h>
#include <stdlib.h>

int Display(int Arr[], int n) {
    int iCnt = 0;
    printf("\nNumbers divisible by 5 and Even are:\n");
    for (iCnt = 0; iCnt < n; iCnt++) {
        if (Arr[iCnt] % 5 == 0 && Arr[iCnt] % 2 == 0) { // Check if the number is even and divisible by 5
            printf("%d ", Arr[iCnt]);
        }
    }
    printf("\n");
}

int main() {
    int n, i;
    int *ptr;

    printf("Enter the number of elements: ");
    if (scanf("%d", &n) != 1 || n <= 0) {
        printf("Invalid input.\n");
        return 1;
    }

    // Allocate memory dynamically using a pointer
    ptr = (int*)malloc(n * sizeof(int));

    // Check if memory allocation was successful
    if (ptr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("Enter %d numbers:\n", n);
    for (i = 0; i < n; i++) {
        // Use pointer arithmetic to store values
        scanf("%d", (ptr + i));
    }

    Display(ptr, n);

    // Free the allocated memory
    free(ptr);

    return 0;
}
   