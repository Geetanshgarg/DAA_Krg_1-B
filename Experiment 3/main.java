class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>(2);
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            ans.add(pair);
        }

        return ans;
    }
}