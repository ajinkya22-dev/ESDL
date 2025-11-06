#include <iostream>
#include <cmath>
using namespace std;


int phi(int n) {
    int result = n;  

   
    for (int i = 2; i *i <= n; i++) {
        if (n % i == 0) {          
            while (n % i == 0) {   
                n /= i;
            }
            result -= result / i;   
        }
    }

   
    if (n > 1) {
        result -= result / n;
    }

    return result;
}

int main() {
    int N;
    cout << "Enter a number N: ";
    cin >> N;

    int count = phi(N);  
    cout << "amount of numbers co-prime with " << N << " is: " << count << endl;

    return 0;
}