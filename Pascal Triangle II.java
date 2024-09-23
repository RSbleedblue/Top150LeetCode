class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allData = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        allData.add(first);
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> eachRow = new ArrayList<>();
            eachRow.add(1);
            for(int j = 1; j < i; j++){
               eachRow.add(allData.get(i-1).get(j-1) + allData.get(i-1).get(j));
            }
            eachRow.add(1);
            allData.add(eachRow);
        }
        return allData.get(rowIndex);
    }
}
