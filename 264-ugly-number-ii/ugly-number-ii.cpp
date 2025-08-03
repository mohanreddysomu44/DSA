class Solution {
public:
    int nthUglyNumber(int n) {
         vector<int> arr(n);
         arr[0]=1;
         int i1=0,i2=0,i3=0;
         for(int i=1;i<n;i++){
            int mul2=arr[i1]*2;
            int mul3=arr[i2]*3;
            int mul5=arr[i3]*5;
            int minimum=min(mul2,min(mul3,mul5));
            int ugly=minimum;
             if(mul2==ugly) i1++;
             if(mul3==ugly) i2++;
             if(mul5==ugly) i3++;
             arr[i]=ugly;
         }
         return arr[n-1];
    }
};