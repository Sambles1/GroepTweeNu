import java.util.*;

class RandomisedQuicksort
{
    /* This function takes last element as pivot,  
    places the pivot element at its correct  
    position in sorted array, and places all  
    smaller (smaller than pivot) to left of  
    pivot and all greater elements to right  
    of pivot */

    int partition(int arr[], int low, int high) //low = 0, high is array length-1
    {
        // pivot is choosen randomly 
        int pivot = arr[high]; //5

        int i = (low-1); // index of smaller element  i is dus nu -1
        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or  
            // equal to pivot  
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)  
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()  
    arr[] --> Array to be sorted,  
    low --> Starting index,  
    high --> Ending index */
    void sort(int arr[], int low, int high)
    {
        if (low < high) //low = 0, high is array length-1
        {  
            /* pi is partitioning index, arr[pi] is  
            now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before  
            // partition and after partition  
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code  
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length; //6

        RandomisedQuicksort ob = new RandomisedQuicksort();
        ob.sort(arr, 0, n-1); //5

        System.out.println("sorted array");
        printArray(arr);
    }
}

// This code is contributed by Ritika Gupta. 