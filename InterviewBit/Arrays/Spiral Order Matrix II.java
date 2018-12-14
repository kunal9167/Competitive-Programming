public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int a) {

        ArrayList<ArrayList<Integer>> retVal = new ArrayList<>();
        for(int i = 0; i<a; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j<a; j++){
                list.add(0);
            }
            retVal.add(list);
        }
        int topRow = 0;
        int bottomRow = a-1;
        int leftCol = 0;
        int rightCol = a-1;
        int n = 1;
        //fill topRow from leftCol to rightCol then increment topRow
        //fill rightCol from topRow to bottomRow then decrement rightCol
        //fill bottomRow from rightCol to leftCol then decrement bottomRow
        //fill leftCol from bottomRow to topRow then increment leftCol
        while( n<=a*a && (topRow<=bottomRow) || (leftCol<=rightCol)){
            for(int col = leftCol; col<=rightCol; col++){
                retVal.get(topRow).set(col, n++);
            }
            topRow++;
            for(int row = topRow; row<=bottomRow; row++){
                retVal.get(row).set(rightCol, n++);
            }
            rightCol--;
            if(n>a*a){
                break;
            }
            for(int col = rightCol; col>=leftCol; col--){
                retVal.get(bottomRow).set(col, n++);
            }
            bottomRow--;
            for(int row = bottomRow; row>=topRow; row--){
                retVal.get(row).set(leftCol, n++);
            }
            leftCol++;
        }
        return retVal;
    }
}
