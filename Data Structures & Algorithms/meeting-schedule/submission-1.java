class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) 
            return true;
        Collections.sort(intervals, (a, b) -> a.start - b.start);

        Interval first = intervals.get(0);
        for (int i = 1; i< intervals.size(); i++ ) {
            Interval second = intervals.get(i);
            if (first.end > second.start) 
                return false;
            else {
                first = second;
            }
        }
        return true;
    }
}