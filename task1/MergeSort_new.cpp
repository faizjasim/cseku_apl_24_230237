#include <iostream>
using namespace std;

// Function to merge two subarrays of arr[]
void merge(int arr[], int l, int mid, int r)
{
    int an = mid - l + 1; // Size of the first subarray
    int bn = r - mid;     // Size of the second subarray

    // Create temporary arrays
    int a[an], b[bn];

    // Copy data to temporary arrays a[] and b[]
    for (int i = 0; i < an; i++)
    {
        a[i] = arr[l + i];
    }
    for (int j = 0; j < bn; j++)
    {
        b[j] = arr[mid + 1 + j];
    }

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;
    // Initial index of merged subarray
    int k = l;

    // Merge the temporary arrays back into arr[l..r]
    while (i < an && j < bn)
    {
        if (a[i] <= b[j])
        {
            arr[k++] = a[i++];
        }
        else
        {
            arr[k++] = b[j++];
        }
    }

    // Copy the remaining elements of a[], if any
    while (i < an)
    {
        arr[k++] = a[i++];
    }

    // Copy the remaining elements of b[], if any
    while (j < bn)
    {
        arr[k++] = b[j++];
    }
}

// Function to implement merge sort
void mergeSort(int arr[], int l, int r)
{
    // Base case: if the array has one or no elements
    if (l >= r)
    {
        return;
    }

    // Find the middle point
    int mid = l + (r - l) / 2;

    // Recursively sort the first and second halves
    mergeSort(arr, l, mid);
    mergeSort(arr, mid + 1, r);

    // Merge the sorted halves
    merge(arr, l, mid, r);
}

int main()
{
    int arr[] = {10, 28, 24, 6, 34, 18, 38, 44};
    int n = sizeof(arr) / sizeof(arr[0]);

    // Call mergeSort on the entire array
    mergeSort(arr, 0, n - 1);

    // Print the sorted array
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
