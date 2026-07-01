#include <stdio.h>
typedef unsigned int UINT;
int main() {
    UINT iNo=0;
    printf("Enter an integer: ");
    if (scanf("%u", &iNo) != 1) {
        printf("Invalid input.\n");
        return 1;
    }
    if (iNo & 0x100) {
        printf("The 9th bit is ON (1).\n");
    } else {
        printf("The 9th bit is OFF (0).\n");
    }
    
    if (iNo & 0x800) {
        printf("The 12th bit is ON (1).\n");
    } else {
        printf("The 12th bit is OFF (0).\n");
    }

    return 0;
}
