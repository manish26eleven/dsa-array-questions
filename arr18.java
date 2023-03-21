public class arr18 {
   public static void main(String[] args) {
    int arr[]={1,1,2,2,3,3,4,5,5,6,6};
    int k;
    for(int i=arr[0];i<=arr[arr.length-1];i++) {
      k=0;
      for(int j=0;j<arr.length;j++) {
         if(arr[j]==i) {
            k++;
         }
      }
      if(k%2==1) {
         System.out.print(i);
      }
    }
   } 
}
