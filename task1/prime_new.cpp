#include <iostream> 
using namespace std;

// Function to check if a number is prime
bool isPrime(int n) {
    if (n <= 1) return false; // Numbers less than or equal to 1 are not prime
    for (int i = 2; i <= n / 2; ++i) {
        if (n % i == 0) return false; // If n is divisible by any number other than 1 and itself, it's not prime
    }
    return true; // If no divisors are found, n is prime
}

int main() {
    int num = 0;

    cout << "Enter a number: "; // Prompt the user for input
    cin >> num; // Read the input value

    // Check if the number is prime and display the result
    if (isPrime(num)) {
        cout << num << " is a prime number." << endl;
    } else {
        cout << num << " is not a prime number." << endl;
    }

    return 0;
}
