#include <stdio.h>
typedef unsigned int UINT;

int main() {
    UINT num1, num2, common_bits;
    int position = 1;

    // Accept two numbers from the user
    printf("Enter first number: ");
    scanf("%u", &num1);
    printf("Enter second number: ");
    scanf("%u", &num2);

    common_bits = num1 & num2;

    printf("Positions of common ON bits: ");
    
    while (common_bits > 0) {
        if (common_bits & 1) {
            printf("%d ", position);
        }
        common_bits >>= 1;
        position++;
    }
    
    printf("\n");
    return 0;
}