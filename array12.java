public class array12 {
    public static void main(String[] args) {
        int arr_1[]= {1,2,3,4};
        int arr_2[]= {5,6,7,8};
        int arr[]= new int[arr_1.length+1];
        int rem=0;
        for(int i=arr_1.length-1;i>=0;i--) {
            arr[i+1] = (arr_1[i]+arr_2[i])%10 + rem;
            rem = (arr_1[i]+arr_2[i])/10;
        }
        arr[0]=rem;
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" , ");
        }
        System.out.println("}");
    }
}
