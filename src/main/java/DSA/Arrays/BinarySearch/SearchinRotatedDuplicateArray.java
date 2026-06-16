package DSA.Arrays.BinarySearch;

public class SearchinRotatedDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean ans = find(nums, target);
        System.out.println(ans);
    }

    static boolean find(int[] arr, int tar) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            return binarysearch(arr, 0, arr.length - 1, tar);
        } else if (arr[pivot] == tar) {
            return true;
        }
        boolean ans = (binarysearch(arr, pivot + 1, arr.length - 1, tar));
        if (ans) {
            ans = binarysearch(arr, 0, pivot - 1, tar);
        }
        return ans;
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[(mid - 1)]) {
                return mid - 1;

            } else {
                if (arr[start] <= arr[mid]) {
                    if (mid < end && arr[mid] == arr[(mid + 1)]) {
                        start = mid + 1;
                    }
                    if (mid > start && arr[mid] == arr[(mid - 1)]) {
                        start = mid + 1;
                    }
                } else {
                    end = mid - 1;
                }

            }

        }
        return -1;
    }

        static boolean binarysearch ( int[] arr, int start, int end, int tar){

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] > tar) {
                    end = mid - 1;
                } else if (arr[mid] < tar) {
                    start = mid + 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

