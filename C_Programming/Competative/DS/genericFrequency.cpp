#include <iostream>
using namespace std;

template <class T>
int  Frequency(T Arr[], int Size, T iNo){
    int i = 0, iCount = 0;

    for(i =0; i<Size;i++){
        if(Arr[i] == iNo){
            iCount++;
        }
    }
    return iCount;
}

int main()
{
    int Crr [] = {10,20,30,10,30,40,10,40,10};
    int iRet = Frequency(Crr,9,10);
    cout << "Frequency is:  "<< iRet<<"\n";

    return 0;
}