#include <iostream>
using namespace std;

template <class T>
T Max(T No1, T No2, T No3)
{
    
    if(No1 >No2 && No1>No3){
        return No1;
    }else if(No2 >No1 && No2>No3){
        return No2;
    }else{
        return No3;
    }
}

int main()
{
    cout << Max(11, 10,12) << "\n";
    cout << Max(11.5f,6.2f, 10.2f) << "\n";
    cout << Max(11.5, 45.6,10.2) << "\n";
    return 0;
}