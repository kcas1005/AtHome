import java.lang.reflect.Array;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {10, 7, 3, 1, 8};
        
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            
            // 가장 작은 값 찾기
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] <  arr[minIndex]){
                    minIndex = j;
                }
            }

            // 교환 (Swap)
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // 결과 출력
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
