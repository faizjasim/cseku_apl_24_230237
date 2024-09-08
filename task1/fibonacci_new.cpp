#include <iostream>

int main() {
    int n = 0, t1 = 0, t2 = 1, nextTerm = 0;

    std::cout << "Enter the number of terms: ";
    std::cin >> n;

    std::cout << "Fibonacci Series: " << t1 << ", " << t2 << ", ";
    nextTerm = t1 + t2;

    for (int i = 3; i <= n; ++i) {
        std::cout << nextTerm << ", ";
        t1 = t2;
        t2 = nextTerm;
        nextTerm = t1 + t2;
    }

    std::cout << std::endl;

    return 0;
}
