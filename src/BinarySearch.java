public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {54, 32, 1};
        int target = 32;
        System.out.println(bs(arr, target));
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean Is_asc = arr[start]<arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Is_asc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target>arr[mid]){
                    start = mid + 1;
                }else {
                    return mid;
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
