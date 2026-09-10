/**class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<=1)
        return intervals;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        int newInterval[] = intervals[0];
        res.add(newInterval);

        for(int curr[] : intervals){
            if(newInterval[1]>=curr[0]){
                newInterval[1] = Math.max(curr[1], newInterval[1]);
            }

            else{
                newInterval = curr;
                res.add(newInterval);
            }
        }

        return res.toArray(new int[res.size()][]);

    }
}**/

class Solution{
    public int[][] merge(int intervals[][]){

        if(intervals.length<=1)
        return intervals;

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

         List<int[]> list = new ArrayList<>();

         int newInterval[] = intervals[0];

         list.add(newInterval);

         for(int curr[] : intervals){
            if(newInterval[1]>=curr[0]){
                newInterval[1] = Math.max(newInterval[1], curr[1]);
            }

            else{
                newInterval = curr;
                list.add(newInterval);
            }
         }

         return list.toArray(new int[list.size()][]);
    }
}