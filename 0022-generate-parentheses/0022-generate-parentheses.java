class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l =new ArrayList<>();
        generate(n,"",0,0,l);
        return(l);
    }
    public static void generate(int n,String ans,int open ,int close,List<String> l){
        if(close==n && open==n){
            l.add(ans);
            return ;
        }
        if(open<n){
            generate(n,ans+"(",open+1,close,l);
        }
        if(close<open){
            generate(n,ans+")",open,close+1,l);   
        }
    }
}