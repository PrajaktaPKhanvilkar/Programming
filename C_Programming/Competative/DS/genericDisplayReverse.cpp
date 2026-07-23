#include <iostream>
using namespace std;

template <class T>
void  Reverse(T Arr[], int Size){
    int i = 0;
    for(i= Size; i>0 ;i--){
        cout<<Arr[i-1]<<"\t";
    }
}



int main()
{
    int Arr [] = {10,20,30,10,30,40,10,40,10};
    Reverse(Arr,9);
    return 0;
}