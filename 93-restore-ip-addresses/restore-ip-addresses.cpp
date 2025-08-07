class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        vector<string> ans;
        backtrack(s,0,"",0,ans);
        return ans;
    }
    void backtrack(const string&s,int index,string current,int dots,vector<string> &ans){
          if(dots==4 && index==s.size()){
             ans.push_back(current);
             return;
          }
          if(dots>4 || index>s.size()) return;

          for(int len=1;len<=3;len++){
            string part=s.substr(index,len);
             if(isValid(part)){
                string res=dots==0?part:current+"."+part;
                backtrack(s,index+len,res,dots+1,ans);
             }
          }

    }
    bool isValid(string str){
         if(str.empty() || (str.size()>1 && str[0]=='0')){
            return false;
         }
         int res=stoi(str);
         return (res>=0 && res<=255);
    }
};