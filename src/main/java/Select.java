import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        int[] arr = {3,6,2,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if(i<minIdx){
                int t = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = t;
            }
        }
    }
}
