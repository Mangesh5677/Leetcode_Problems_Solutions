class Solution {
    public String reverseWords(String s) {
       String strs[] =s.split("\\s+");
       String ans="";

       for(int i=strs.length-1;i>=0;i--){
         ans=ans+(strs[i]+" ");
       }
       return ans.trim();
    }
}