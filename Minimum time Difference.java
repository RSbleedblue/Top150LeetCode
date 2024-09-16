class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> differenceList = new ArrayList<>();
        for(String str : timePoints){
            String[] splitTime = str.split(":");
            int hours = Integer.parseInt(splitTime[0]);
            int minutes = Integer.parseInt(splitTime[1]);
            int getMinuteValue = hours * 60 + minutes;
            differenceList.add(getMinuteValue);
        }
        Collections.sort(differenceList);
        int minDifference = Integer.MAX_VALUE;
        for(int i = 0; i < differenceList.size() - 1; i++) {
            minDifference = Math.min(minDifference, differenceList.get(i + 1) - differenceList.get(i));
        }
        minDifference = Math.min(minDifference, differenceList.get(0) + 1440 - differenceList.get(differenceList.size() - 1));
        return minDifference;
    }
}
