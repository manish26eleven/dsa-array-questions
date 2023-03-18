public class array13 {
    public static void main(String[] args) {
        int arr_1[]={5,6,7,8};
        int arr_2[]={2,9,9,9};
        int arr[]=new int[arr_1.length];
        for(int i=arr_1.length-1;i>=0;i--) {
            if(arr_1[i]<arr_2[i]) {
               arr[i] = (arr_1[i]+10)-arr_2[i];
               arr_1[i-1]=arr_1[i-1]-1;
            } else {
                arr[i]=arr_1[i] - arr_2[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
