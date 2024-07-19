//https://leetcode.com/problems/word-search
class Solution {
    public boolean exist(char[][] board, String word) {
        //Using DFS
        int index=0,row=board.length,col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(index)){
                    if(search(i,j,row,col,index,board,word))
                        return true;
                }
            }
        }
        return false;   
    }
    public boolean search(int i,int j,int row,int col,int index,char[][] board,String word){
        if(word.length()==index)    return true;
        if(i<0||j<0||i==row||j==col||board[i][j]!=word.charAt(index)||board[i][j]==0)  return false;
        char c=board[i][j];
        board[i][j]=0;
        boolean bottom=search(i+1,j,row,col,index+1,board,word);
        boolean top=search(i-1,j,row,col,index+1,board,word);
        boolean right=search(i,j+1,row,col,index+1,board,word);
        boolean left=search(i,j-1,row,col,index+1,board,word);
        board[i][j]=c;
        return top||bottom||left||right;
    }
}