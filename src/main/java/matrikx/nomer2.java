package matrikx;
public class nomer2 {
    public static void main(String[] args) {
        int[][]A = {
            {3,7},
            {2,4},
            {5,8},
        };
        int[][]B = {
            {6,2},
            {3,5},
            {8,7},
        };
        int[][] C =new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j]=A[i][j]-B[i][j];
                System.out.print(C[i][j]+" ");
            }
        
            System.out.println();
        }
    }
    
}

