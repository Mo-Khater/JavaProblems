public static void main(String[] args) {
//    Matrix matrix=new Matrix(3,2);
//    int [] arrnum={1,2,3,4,5,6};
//    if(matrix.setNumbers(arrnum))
//    {
//        matrix.Transpose();
//        matrix.Print();
//    }
//    else {
//        System.out.print("wrong input");
//    }
    IdentityMatrix identityMatrix=new IdentityMatrix(3,3);
    int [] arrnum={1,0,0,0,1,0,0,0,1};
    if(identityMatrix.setNumbers(arrnum))
    {
        identityMatrix.Transpose();
        identityMatrix.Print();
    }
    else {
        System.out.print("wrong input");
    }
}