#include<stdio.h>
void pattern(int iRow, int iCol){
    int i = 0, j =0;
    char ch = '\0', ch1 = '\0';
    for(i = 1; i <= iRow; i++){
        for(j = 1, ch = 'A',ch1='a'; j <= iCol; j++, ch++, ch1++){
            if(i % 2 == 0){
                printf("%c\t",ch1);
            }
            else{
            printf("%c\t",ch);
            }
        }
        printf("\n");
    }

}

int main(){
    int iRow = 0, iCol = 0;
    printf("Enter the number of rows : \n");
    scanf("%d",&iRow);
    printf("Enter the number of columns : \n");
    scanf("%d",&iCol);
    pattern(iRow, iCol);
    return 0;
}