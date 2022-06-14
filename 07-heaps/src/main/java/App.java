public class App {
    public static void main(String[] args) {
        int[] nums = {10,9,8,6,7,8,6,5,5,3};
        int k = 2;
        MyHeap heap = new MyHeap(nums.length);
        for (int num : nums) {
            heap.insert(num);
        }
        System.out.println(kthLargest(heap, k));
    }

    public static int kthLargest(MyHeap heap, int k) {
        if(k==1) return heap.getRoot();
        heap.remove();
        return kthLargest(heap, --k);
    }
}
