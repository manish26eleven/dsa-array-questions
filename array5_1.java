public class array5_1 {
    public static void main(String[] args) {
      int arr[]= {1,2,3,4,5};
      boolean str = sort(arr,0);
      if(str==true) {
        System.out.println("ARRAY IS SORTED");
      } else {
        System.out.println("ARRAY IS NOT SORTRD");
      }
    }
    public static boolean sort(int[] arr,int i) {
        if(i==arr.length-1) {
            return true;
        }
        if(arr[i+1]>arr[i]) {
            sort(arr,i+1);
        }
        if(arr[i]>arr[i+1]) {
            return false;
        }
        return true;
    }
}
