class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int res=0;
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        
        for(int i=0;i<boxTypes.length;i++){
            
            res+=(truckSize >= boxTypes[i][0] ? boxTypes[i][0]*boxTypes[i][1] :                                                             truckSize*boxTypes[i][1]);
            
            truckSize=(boxTypes[i][0]>=truckSize ? 0 : truckSize-boxTypes[i][0]);
            
            if(truckSize==0) return res;
        }
        return res;
    }
}
