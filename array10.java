public class array10 {
    public static void main(String[] args) {
        int arr[]={3,5,1,7,5,9};
        arr[arr.length-1]=arr[0];
        for(int i=0;i<arr.length-1;i++) {
            arr[i]=arr[i+1];

        }
        
    for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
    }
}
}
