// Last updated: 11/07/2026, 00:05:58
class MedianFinder {
public:
    // max-heap for the smaller half
    priority_queue<int> leftMax;
    // min-heap for the larger half
    priority_queue<int, vector<int>, greater<int>> rightMin;

    MedianFinder() {}

    void addNum(int num) {
        // Insert into correct half
        if (leftMax.empty() || num <= leftMax.top())
            leftMax.push(num);
        else
            rightMin.push(num);

        // Rebalance: leftMax can be at most 1 larger than rightMin
        if (leftMax.size() > rightMin.size() + 1) {
            rightMin.push(leftMax.top());
            leftMax.pop();
        } else if (rightMin.size() > leftMax.size()) {
            leftMax.push(rightMin.top());
            rightMin.pop();
        }
    }

    double findMedian() {
        if (leftMax.empty()) return 0.0; // safe guard

        if (leftMax.size() == rightMin.size())
            return (leftMax.top() + rightMin.top()) / 2.0;
        return static_cast<double>(leftMax.top());
    }
};