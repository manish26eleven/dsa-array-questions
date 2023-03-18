// array is sorted or not {1,2,3,4,5}
public class array5 {
    public static void main(String[] args) {
    int arr[]= {1,2,3,4,5};
    for(int i=0;i<arr.length;i++) {
        if(i==arr.length-1) {
            System.out.println("array is sorted");
        }
        if(arr[i+1]<arr[i]) {
            System.out.println("array is not sorted");
            break;
        }
    }
}
}
