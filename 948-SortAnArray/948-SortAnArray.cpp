// Last updated: 11/07/2026, 00:05:34
class Solution {
public:
    void maxHeapify(vector<int>& arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            swap(arr[i], arr[largest]);
            maxHeapify(arr, n, largest);
        }
    }

    void buildMaxHeap(vector<int>& arr) {
        int n = arr.size();
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);
    }

    vector<int> sortArray(vector<int>& nums) {
        int n = nums.size();
        buildMaxHeap(nums);

        for (int i = n - 1; i > 0; i--) {
            swap(nums[0], nums[i]);      // Move current max to end
            maxHeapify(nums, i, 0);      // Heapify reduced heap
        }
        return nums;
    }
};
