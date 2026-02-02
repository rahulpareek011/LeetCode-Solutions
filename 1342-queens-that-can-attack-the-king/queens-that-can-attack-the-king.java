class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] g = new boolean[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                g[i][j]=false;
            }
        }
        for(int[] i:queens){
            g[i[0]][i[1]] = true;
        }
        List<List<Integer>> ans = new ArrayList<>();

        //bottom side
        int x=king[0];
        int y =king[1];
        while(x<7)
        {
            x++;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }

        //top side
        x=king[0];
        y =king[1];
        while(x>0)
        {
            x--;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }
        
        //rigth side
        x=king[0];
        y =king[1];
        while(y<7)
        {
            y++;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }

        //left side
        x=king[0];
        y =king[1];
        while(y>0)
        {
            y--;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }

        //diagonally down right side
        x=king[0];
        y =king[1];
        while(x<7&&y<7)
        {
            x++;
            y++;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }

        //diagonally down left side
        x=king[0];
        y =king[1];
        while(x<7&&y>0)
        {
            x++;
            y--;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }


        //diagonally top left side
        x=king[0];
        y =king[1];
        while(x>0&&y>0)
        {
            x--;
            y--;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }

        //diagonally top right side
        x=king[0];
        y =king[1];
        while(x>0&&y<7)
        {
            x--;
            y++;
            if(g[x][y]){
                List<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                ans.add(temp);
                break;
            }
        }
        return ans;
    }
}