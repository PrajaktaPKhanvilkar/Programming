#include<stdio.h>

float Area(float fWidth, float fHeight){
    float fArea = 0.0;
    if(fWidth < 0){
        fWidth = -fWidth;
    }
    if(fHeight < 0){
        fHeight = -fHeight;
    }
    fArea = fWidth * fHeight;
    return fArea;
}

int main(){
    float fWidth =0;
    float fHeight = 0;
    float fRet = 0;
    printf("Enter a Width :\n");
    scanf("%f",&fWidth);
    printf("Enter a Height :\n");
    scanf("%f",&fHeight);   

    fRet = Area(fWidth,fHeight);
    printf("Area of rectangle with width %.2f and height %.2f is : %.2f\n",fWidth,fHeight,fRet);
    return 0;
}