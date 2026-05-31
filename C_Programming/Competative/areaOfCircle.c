#include<stdio.h>

float Area(float fNo){
    float fArea = 0.0;
    if(fNo < 0){
        fNo = -fNo;
    }
    fArea = 3.14 * fNo * fNo;
    return fArea;
}

int main(){
    float fValue =0;
    float fRet = 0;
    printf("Enter a Radius :\n");
    scanf("%f",&fValue);
    fRet = Area(fValue);
    printf("Area of circle with radius %.2f is : %.2f\n",fValue,fRet);
    return 0;
}