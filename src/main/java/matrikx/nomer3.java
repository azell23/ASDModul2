package matrikx;
public class nomer3 {
    public static void main(String[] args) {
       int[][] matriks_a = {
            {3,8,5},
            {4,2,6},
            
        };
        int[][] matriks_b = {
            {3,3},
            {2,8},
            {5,6}
        };
        
        int[][] hasilKali = new int[matriks_a.length][matriks_b[0].length];
        for (int i=0; i<matriks_a.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                for (int k=0; k<matriks_a[0].length; k++){
                    hasilKali[i][j] += (matriks_a[i][k]*matriks_b[k][j]);
                }
            }
        }
        for (int[] x: hasilKali){
            for (int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
      
    }
}