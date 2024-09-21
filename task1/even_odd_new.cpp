#include <iostream> // Include the iostream library for input and output operations
using namespace std;

int main() {
    int num = 0; // Initialize variable to store the input number

    cout << "Enter an integer: "; // Prompt the user for input
    cin >> num; // Read the input value

    // Check if the number is even or odd and display the result
    if (num % 2 == 0) {
        cout << num << " is even." << endl;
    } else {
        cout << num << " is odd." << endl;
    }

    return 0; // Indicate successful program termination
}
