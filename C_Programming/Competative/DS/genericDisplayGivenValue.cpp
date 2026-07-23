#include <iostream>
using namespace std;

template <class T>
void  Display(T iValue, int Size){
    int i = 0;
    for(i =0; i<Size;i++){
        cout<<iValue<<"\t";
    }
    cout<<"\n";
}


int main()
{
    Display('M',7);
    Display(11,3);
    Display(3.7,6);

    return 0;
}