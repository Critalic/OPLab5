package Task1;

public class Task1 {

    public static void main(String[] args) {
        int[][] array0 = {
            {1, 1,  8, 1},
            {-2,-2,-0, 5},
            {20,-20,0, 4},
            {1, 1,  3, 4},
            
        };
        show(array0);

    }

    public static void show(int[][] matrix) {
        System.out.println("Введений масив: [");
        for (int i = 0; i < matrix.length; i++) {
            for (int b = 0; b < matrix[i].length; b++) {
                System.out.print(matrix[i][b] + "  ");
            }
            System.out.println("");
        }
        System.out.println("]");

        System.out.println("");
        System.out.print("Елемент дорівнює " + minElementInLargestColumn(matrix));

    }

    public static int minElementInLargestColumn(int[][] matrix) {
        int res;
        
        
        
        int[] sumInColumns = new int[matrix[0].length];
        //summs up the elements in the columns
        for (int i = 0; i < matrix[0].length; i++) {
            res = 0;
            for (int b = 0; b < matrix.length; b++) {
                if (matrix[b][i] >= 0) {
                    res += matrix[b][i];
                }
                if (matrix[b][i] < 0) {
                    res += Math.abs(matrix[b][i]);
                }
            }
            sumInColumns[i] = res;
        }
        
        int compare = sumInColumns[0];
        for( int i = 0; i<sumInColumns.length; i++) {
            if(compare<sumInColumns[i]) compare = sumInColumns[i];
        }
        
        int[] indexesOfMaxNumbers = new int[sumInColumns.length];
        int[] maxNumbers = new int[sumInColumns.length];
        for(int i=0; i<sumInColumns.length;i++) {
            if(compare ==sumInColumns[i]) {
                maxNumbers[i] = sumInColumns[i];
                indexesOfMaxNumbers[i] = i;
            }
        }
        
        int[] finalNumbers = new int[maxNumbers.length];
        compare = matrix[0][indexesOfMaxNumbers[0]];
        for(int i=0; i< indexesOfMaxNumbers.length; i++) {
            for(int b = 0; b<matrix.length; b++) {
                if(compare>matrix[b][i]) compare = matrix[b][i];  
            }
        }
        
        return compare;
    }
}
