public class IdentityMatrix extends Matrix{
   public IdentityMatrix(int m,int n)
   {
       super(m,n);
   }
    public boolean setNumbers(int[] numbers) {
        if(numbers.length!= M*N||N!=numbers.length/M)
            return false;
       int[][] tempmatrix=new int [M][N];
        int k=0;
        for (int i=0;i<M;i++)
        {
            for (int j=0;j<N;j++) {
                if (i==j&&numbers[k]!=1)
                    return false;
                tempmatrix[i][j] = numbers[k++];
            }
        }
        Numbers=tempmatrix;
        return true;
    }
    public void Transpose(){
        // we won't do any thing
    }
}
