class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intervals.get(j).start > intervals.get(j + 1).start) {
                    Interval temp = intervals.get(j);
                    intervals.set(j, intervals.get(j + 1));
                    intervals.set(j + 1, temp);
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (intervals.get(i - 1).end > intervals.get(i).start) {
                return false;
            }
        }
        
        return true;
    }
};