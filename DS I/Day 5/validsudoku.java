class Solution {
    public boolean isValidSudoku(char[][] board) {
         int i,j;
        HashMap<Character,Integer> m=new HashMap<>();
        int n=9;
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                char ch=board[i][j];
                if(ch=='.')
                {
                    continue;
                }
                else if(m.containsKey(ch))
                {
                    return false;
                }
                else
                {
                    m.put(ch,1);
                }
            }
            m.clear();
        }
        
        for(j=0;j<9;j++)
        {
            for(i=0;i<9;i++)
            {
                char ch=board[i][j];
                if(ch=='.')
                {
                    continue;
                }
                else if(m.containsKey(ch))
                {
                    return false;
                }
                else
                {
                    m.put(ch,1);
                }
            }
            m.clear();
        }
        int k=0;
        while(k<9)
        {
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    int row=i+3*(k/3);
                    int col=j+3*(k%3);
                    char ch=board[row][col];
                    if(ch=='.')
                    {
                        continue;
                    }
                    else if(m.containsKey(ch))
                    {
                        return false;
                    }
                    else
                    {
                        m.put(ch,1);
                    }
                }
            }    
            m.clear();
            k++;
        }
		  return true;
        
    }
}
