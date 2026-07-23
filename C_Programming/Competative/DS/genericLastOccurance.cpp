#include <iostream>
using namespace std;

template <class T>
int  Frequency(T Arr[], int Size, T iNo){
    int i = 0;

    for(i =Size; i>0;i--){
        if(Arr[i-1] == iNo){
           return i;
        }
    }
}

int main()
{
    int Crr [] = {10,20,30,10,30,40,10,40,10};
    int iRet = Frequency(Crr,9,40);
    cout << "Frequency is:  "<< iRet<<"\n";

    return 0;
}