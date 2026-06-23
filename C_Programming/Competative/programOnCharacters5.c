#include<stdio.h>
#include<stdbool.h>
void  DisplayASCII(){
    int i = 0;
    for(i = 0; i<=255; i++){
        printf("%c\t",i);
    }
}

int main(){
    DisplayASCII();
    return 0;
}