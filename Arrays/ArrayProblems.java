package Arrays;


public class ArrayProblems {

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,3,2};
        ArrayProblems arrayProblems = new ArrayProblems();
        int val =  arrayProblems.findMax(arr);
        System.out.println(val);
    }

    public int findMax(int arr[]){
        int max_sum = 0;
        int tar = 6;
        int k =3;
        int count = 0;
        for (int i = 0; i < k; i++) {
            max_sum += arr[i];
        }
        if (max_sum == tar) {
            count++;
        }
        int cur_sum = max_sum;
        for (int i = k; i < arr.length; i++) {
            cur_sum = cur_sum - arr[i-k] + arr[i];
            max_sum = Math.max(max_sum, cur_sum);
            if (cur_sum == tar) {
                count++;
            }
        }
        return count;
    }
}