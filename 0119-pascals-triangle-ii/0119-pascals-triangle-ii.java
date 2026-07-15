class Solution {
    Map<String, Integer> map= new HashMap<>();
        public int getRowCol(int row , int col){
            if(row == 0 || col == 0 || row == col){
                return 1;
            }
            String key = Integer.toString(row) + " " + Integer.toString(col);
            if(map.containsKey(key)){
                return map.get(key);
            }

            int res = getRowCol(row-1 , col-1) + getRowCol(row-1 , col);
            map.put(key,res);
            return map.get(key);
        } 

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        int row = rowIndex;
        for(int col=0;col<=rowIndex;col=col+1){
            res.add(getRowCol(row,col));
        }
        return res;
    }
}