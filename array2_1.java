// find 2nd max from given array
public class array2_1 {
    public static void main(String[] args) {
        int arr[] = {10,20,3,11,50};
        int max1,max2;
        if(arr[1]>=arr[0]) {
             max1=arr[1];
             max2=arr[0];
        } else {
            max1=arr[0];
            max2=arr[1];
        }
        for(int i=2;i<arr.length;i++) {
            if(arr[i]>max1) {
                max2=max1;
                max1=arr[i];
            }
            if(arr[i]>max2&&arr[i]<max1) {
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}