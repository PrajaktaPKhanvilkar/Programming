#include<stdio.h>

void pattern(int iRow, int iCol){
    int i = 0, j =0;
        if(iRow != iCol){
             printf("Invalid Parameters");
             printf("Numbers of rows and columns should be same");
             return;
        }
        for (i = 1; i <= iRow; i++) {
            for (j = iCol; j >0; j--) {
                if(i==j){
                    printf("#\t");
                }else if(i>j){
                    printf("@\t");
                    }else{
                        printf("*\t");
                    }
        }
        printf("\n");
    }
}
int main(){
    int iValue1 = 0, iValue2 = 0;
    printf("Enter the number of rows : \n");
    scanf("%d",&iValue1);
    printf("Enter the number of columns : \n");
    scanf("%d",&iValue2);
    pattern(iValue1, iValue2);
    return 0;
}


