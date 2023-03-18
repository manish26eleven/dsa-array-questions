// find 2nd max from given array
 class array2 {
   
public static int manish(int arr[],int i,int max1,int max2) {
    if(i==arr.length) {
        
        
        return max2;
    }
        if(arr[i]>max1) {
            max2=max1;
            max1=arr[i];
           return manish(arr, i+1, max1, max2);
        }
        if(arr[i]>max2 && arr[i]<max1) {
            max2=arr[i];
           return manish(arr, i+1, max1, max2);
        } if(max2>arr[i]) {
           return manish(arr, i+1, max1, max2);
        } 
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,3,11,50};
        int max1 = 0;
        int max2 = 0;
        if(arr[1]>=arr[0]) {
            max1=arr[1];
            max2=arr[0];
       } else {
           max1=arr[0];
           max2=arr[1];
       }
    
       int ans = manish(arr, 2, max1, max2);
       System.out.println(ans);
        
    }
}

