#include <iostream>

int main() {
    int n = 0, factorial = 1;

    std::cout << "Enter a positive integer: ";
    std::cin >> n;

    for (int i = 1; i <= n; ++i) {
        factorial *= i;
    }

    std::cout << "Factorial of " << n << " = " << factorial << std::endl;

    return 0;
}
