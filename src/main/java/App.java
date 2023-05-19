public class App {
    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return -1;
        return 0;
    }

    public int max(int[] arr) {
        if(arr.length == 0) return -1;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
