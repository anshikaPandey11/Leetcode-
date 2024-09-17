class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String str : arr1) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        List<String> list = new ArrayList<>();
        for (String str : arr2) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                list.add(e.getKey());
            }
        }
        String res[] = new String[list.size()];
        int i = 0;
        for (String str : list) {
            res[i++] = str;
        }
        return res;
    }
}
