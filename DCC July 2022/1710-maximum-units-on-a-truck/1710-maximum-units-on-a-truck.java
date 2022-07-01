class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int[] count = new int[1001];
        for(int[] boxtype : boxTypes){
            count[boxtype[1]]+= boxtype[0];
        }
        
        int c =0;
        for(int i=count.length-1; i>=0; i--){
            
            if(count[i] == 0) continue;
            int num = Math.min(count[i], truckSize);
            c += num * i;
            truckSize -= num;
            if (truckSize == 0) break;
        }
        return c;
    }
}