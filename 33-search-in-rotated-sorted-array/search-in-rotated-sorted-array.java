class Solution {

      public int binarySearch(int st,int end,int arr[],int target){
            while(st<=end){
                int mid=st+(end-st)/2;

                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]<target){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }

            return -1;
      }
    public int search(int[] arr, int target) {
                int st=0,end=arr.length-1;
                  int pivot=-1;
           while(st<=end){
               int mid=st+(end-st)/2;
               if(mid+1<=arr.length-1 &&arr[mid]>arr[mid+1]){
                  pivot=mid;
                  break;
               }
               if(mid-1>=0 && arr[mid]<arr[mid-1] ){
                pivot=mid-1;
                break;
               }
               
               if(arr[st]>=arr[mid]){
                end=mid-1;
               }else {
                  st=mid+1;
               }
           }

           int first=binarySearch(0,pivot,arr,target);
           int second=binarySearch(pivot+1,arr.length-1,arr,target);

           if(first!=-1){
            return first;
           }

           return second;

    }
}