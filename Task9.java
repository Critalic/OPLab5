
package Task9;

public class Task9 {
    public static void main(String[] args) {
        int[] [] arrAy = { 
            {0, 0, 0},
            {0,0,0},
            {0, 0, 0},
        };
        showArray(arrAy);
    }
    
    public static void showArray( int[][] matrix) {
        System.out.println("Введений масив: [");
        for(int i=0; i<matrix.length; i++ ) {
            for(int b=0; b<matrix[i].length;b++) {
                System.out.print(matrix[i][b] + "  ");
            }
            System.out.println("");
        }
        System.out.println("]");
        System.out.println("");
        toArray(matrix);
    }
    
    public static void toArray(int [][] matrix) {
        int numNonZero = 1;
        for(int i=0; i<matrix.length;i++) {
            for(int b = 0; b<matrix[i].length; b++) {
                if( matrix[i][b] !=0 ) {
                    System.out.println("Номер рядка " + (i+1));
                    System.out.println("Номер стовбця " + (b+1));
                    System.out.println("Значення елемента: " + matrix[i][b]);
                    System.out.println("");
                    numNonZero++;
                    
                }
            }
                       
            
            }
        if ( numNonZero ==1) {
            System.out.println("Немає ненульових елементів");  
        }
    }
}


