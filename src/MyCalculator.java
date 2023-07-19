public class MyCalculator {

    // sort using 'buble sort', time complexity is O(N^2)
    public static void sortByAscending(int[] arr){
        // TODO: using other algorithms better
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static String stringConcatenator(String str1, String str2,
                                            String str3, String str4, String str5){
        String stringConcat = str1 + str2 + str3 + str4 + str5;
        return stringConcat;
    }
}
