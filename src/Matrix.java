interface Addable{
    int[][] Add(Object obj); // return 2D array as we deal with 2D arrays
}
public  class Matrix implements Addable{
    protected int[][] Numbers;
    protected int M,N;
    public Matrix(int n,int m)
    {
        N=n;
        M=m;
        Numbers=new int[m][n];
    }

    public boolean setNumbers(int[] numbers) {
        if(numbers.length!= M*N)
            return false;
        int k=0;
        for (int i=0;i<M;i++)
        {
            for (int j=0;j<N;j++) {
                Numbers[i][j] = numbers[k++];
            }
        }
        return true;
    }
    public void Print()
    {
        for (int i=0;i<M;i++)
        {
            for (int j=0;j<N;j++) {
                System.out.print(Numbers[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public void Transpose(){
        int[][] transposeNumbers=new int[N][M];
        int transposeI=0;
        int transposeJ=0;

        for (int i=0;i<M;i++)
        {
            for (int j=0;j<N;j++)
            {
                transposeNumbers[transposeI++][transposeJ]=Numbers[i][j];
            }
            transposeJ++;
            transposeI=0;
        }
        Numbers=transposeNumbers;
        int temp=N;
        N=M;
        M=temp;
    }
    public int[][] Add(Object obj)
    {
        Matrix addedMatrix=(Matrix)obj;
        int [][] result=new int[M][N];
        for (int i=0;i<M;i++)
        {
            for (int j=0;j<N;j++)
            {
                result[i][j]=Numbers[i][j]+addedMatrix.Numbers[i][j];
            }
        }
        return result;
    }
}
