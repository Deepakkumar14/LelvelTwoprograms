public class BinarySearch {
        public int binarySearch(int[] arr, int key) {

            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                System.out.println("1");
                int mid = (start + end) / 2;
                if (key == arr[mid]) {
                    return mid;
                }
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {

            BinarySearch bs = new BinarySearch();
            int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 ,18};
            System.out.println("Key 14's position: " + bs.binarySearch(arr, 14));
        }
    }

