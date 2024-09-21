#include <iostream> // Include the iostream library for input and output operations
using namespace std;

int main() {
    int n = 0, t1 = 0, t2 = 1, nextTerm = 0; // Initialize variables

    cout << "Enter the number of terms: "; // Prompt the user for input
    cin >> n; // Read the input value

    // Display the first two terms of the Fibonacci series
    cout << "Fibonacci Series: " << t1 << ", " << t2 << ", ";
    nextTerm = t1 + t2; // Calculate the next term

    // Generate and display the remaining terms of the Fibonacci series
    for (int i = 3; i <= n; ++i) {
        cout << nextTerm << ", ";
        t1 = t2;
        t2 = nextTerm;
        nextTerm = t1 + t2; // Update nextTerm
    }

    cout << endl; // Print a newline at the end

    return 0; // Indicate successful program termination
}
