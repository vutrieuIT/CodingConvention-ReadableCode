public class MyCalculator {

    public static void cal(int[] arr){
        // The first loop is used to iterate over all elements of the array,
        for(int i=1;i<arr.length;i++){
            // The second loop is used to iterate over the elements of the array,
            // starting from the element after the one selected in the first loop.
            for(int j=i+1;j<arr.length;j++){
                // Compare the i-th element with the elements after it in the array.
                if(arr[i]>arr[j]){
                    // If the i-th element is greater than the j-th element, swap their positions.
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static String stringConcatenator(String str1, String str2, String str3, String str4, String str5){
        String retval = str1 + str2 + str3 + str4 + str5;
        return retval;
    }
}
