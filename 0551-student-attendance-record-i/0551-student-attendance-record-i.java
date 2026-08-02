class Solution {
    public boolean checkRecord(String s) {
        int cntA=0;
        int cntL=0;

        for(char ch:s.toCharArray()){
            if(ch!='L'){
                cntL=0;
            }
            if(ch=='L'){
                cntL++;
            }
            if(ch=='A'){
                cntA++;
            }
            if(cntA==2 || cntL==3){
                return false;
            }
        }
        return true;
    }
}