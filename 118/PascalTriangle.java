class Solution {
   public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows == 0) return result;
        
        List<Integer> row = null;
        List<Integer> prev = null;
        
        for (int i=0;i<numRows;i++){
            row = new ArrayList<>();
            for (int j = 0;j<=i;j++)
                row.add((j == 0 || j == i) ? 1 : prev.get(j-1) + prev.get(j));
            prev = row;
            result.add(row);
        }
        
        return result;
        
    }
}
