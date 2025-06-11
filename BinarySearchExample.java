public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                return mid; // 찾은 경우 인덱스 반환
            } else if (arr[mid] < target){
                left = mid + 1; // 오른쪽으로 탐색
            } else {
                right = mid -1; // 왼쪽으로 탐색
            }
        }
        return -1; // 못 찾은 경우
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,16};
        int target = 3;

        int result = binarySearch(arr, target);

        if(result != -1){
            System.out.println("Index of " + target + " : " + result);
        } else {
            System.out.println("Not found");
        }
    }
}
