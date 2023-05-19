public class SortArray{
    public static int[] sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] arr = {7,5,3,2,1};
        System.out.println("Given Array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        int[] sortedarray = sortArray(arr);
        System.out.println("Sorted Array:");
        for(int j = 0; j < arr.length; j++){
            System.out.print(sortedarray[j]+"\t");
        }
    }
}
