#include <iostream>
using namespace std;

template <class T>
T Multiply(T No1, T No2)
{
    T Ans;
    Ans = No1 * No2;
    return Ans;
}

int main()
{
    cout << Multiply(11, 10) << "\n";
    cout << Multiply(11.5f, 10.2f) << "\n";
    cout << Multiply(11.5, 10.2) << "\n";
    return 0;
}