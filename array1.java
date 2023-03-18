// find max element from given aray {10,20,3,11,50}
class array1 {
    public static void main(String[] args) {  
    int arr[] = {10,20,3,11,50};
    int max= arr[0];
    int temp=0;

    for( int i=1;i<arr.length;i++) {
        if(max < arr[i]) {
            max=arr[i];
            temp = i;
        }    
    }
    System.out.print("the maximum element of array is "+ max +" found at " + temp);
    
    }
}
//   

