class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        String sub=countAndSay(n-1);

          String res="";

          for(int i=0;i<sub.length();i++){
             int count=1;
             char ch=sub.charAt(i);
              while(i<sub.length()-1 && sub.charAt(i)==sub.charAt(i+1)){
                 count++;
                 i++;
              }

              res+=count+""+ch;
          }

          return res;
    }
}