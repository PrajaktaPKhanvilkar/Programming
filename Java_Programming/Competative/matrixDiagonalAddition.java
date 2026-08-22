import java.util.*;

class Matrix {
    protected int Arr[][];
    protected int iRow;
    protected int iCol;

    public Matrix(int iRow, int iCol) {
        System.out.println("Inside Matrix Constructor");
        Arr = new int[iRow][iCol];
        this.iRow = iRow;
        this.iCol = iCol;
    }

    public void Accept() {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter  Elements of Matrix :");

        for (i = 0; i < iRow; i++) {
            for (j = 0; j < iCol; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    public void Display() {
        int i = 0, j = 0;
        System.out.println("Elements of Matrix are :");

        for (i = 0; i < Arr.length; i++) {
            for (j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class MatrixLB extends Matrix {
    public MatrixLB(int iRow, int iCol) {
        super(iRow, iCol);
    }
    public void SummationDiagonal() {
        int i = 0, j = 0, iSum = 0;
        for (i = 0; i <iRow; i++) {
            for (j = 0; j <iCol; j++) {
                if (i == j) {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        System.out.println("Summation  is :" + iSum);
    }
}
public class matrixDiagonalAddition {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0,iRet =0;
        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of cols");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();
        mobj.SummationDiagonal();
        mobj = null;
        System.gc();

    }
}