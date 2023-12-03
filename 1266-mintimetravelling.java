class Solution {
    
    public int travel(int start[],int end[],int time){
        time = Math.max(Math.abs(start[0]-end[0]),Math.abs(start[1]-end[1]));
        return time;
    }
    
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i=0;i<points.length-1;i++){
            time += travel(points[i],points[i+1],time);
        }
        return time;
    }
}
