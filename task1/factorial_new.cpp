#include <iostream> 
using namespace std;

int main() {
    int n = 0, factorial = 1; // Initialize variables

    cout << "Enter a positive integer: "; // Prompt the user for input
    cin >> n; // Read the input value

    // Calculate the factorial of the number
    for (int i = 1; i <= n; ++i) {
        factorial *= i; // Update factorial
    }

    cout << "Factorial of " << n << " = " << factorial << endl; // Display the result

    return 0;
}
