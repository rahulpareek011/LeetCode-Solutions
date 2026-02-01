class Solution {
    public String reorganizeString(String s) {
        int n = s.length();

        // Max heap based on frequency
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);

        Map<Character, Integer> mp = new HashMap<>();

        // Frequency map
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        // Push into heap
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            pq.add(new int[]{e.getValue(), e.getKey()});
        }

        StringBuilder res = new StringBuilder();

        // Take top two most frequent chars
        while (pq.size() > 1) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            res.append((char) first[1]);
            res.append((char) second[1]);

            if (--first[0] > 0) pq.add(first);
            if (--second[0] > 0) pq.add(second);
        }

        // Handle remaining character
        if (pq.size() == 1) {
            int[] rem = pq.poll();
            if (rem[0] > 1) return "";
            res.append((char) rem[1]);
        }

        return res.toString();
    }
}
