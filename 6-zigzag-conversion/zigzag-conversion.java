class Solution {
    public String convert(String s, int numRows) {
       if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        int idx = 0, d = 1;
        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();        
    }
}

/*
    🔁 Why this works:
    Condition	            Action	    Reason
    idx == 0	            d = 1       You hit top, must go down
    idx == numRows - 1	    d = -1	    You hit bottom, must go up
*/