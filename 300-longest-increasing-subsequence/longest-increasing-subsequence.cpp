class Solution {
public:
    int lengthOfLIS(vector<int>& arr) {

 vector<int> newarr(arr.size(),1);

   
 for(int i=1;i<arr.size();i++){
    for(int j=i-1;j>=0;j--){
      if(arr[j]<arr[i]){
        newarr[i]=max(newarr[i],newarr[j]+1);
      }
    }
 }
   int   max=newarr[0];
  for(int i=0;i<newarr.size();i++){

    if(max<newarr[i]){
      max=newarr[i];
    }
  }
  
  return max;

    }
};