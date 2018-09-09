public class Task8 {
    public int findSumRow(int[] rowArray){
        int sum=0;
        for (int i = 0; i < rowArray.length; i++) {
            sum+=rowArray[i];
        }
        return sum;
    }

    public int findMaxSumRow(int [][]matrix){
        int sum=0;
        int index =0;
        for (int i = 0; i < matrix.length; i++) {
            if(sum<findSumRow(matrix[i]))
            {sum=findSumRow(matrix[i]);
            index=i;}
        }
        return index;
    }







}
