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

    public void reverseRows() {
        int i = 0;
        System.out.println("Reversed Rows are: ");
        for ( i = 0; i < Arr.length; i++) {
        for (int j = Arr[i].length - 1; j >= 0; j--) {
            System.out.print(Arr[i][j] + "\t");
        }
        System.out.println();
    }
    }
}

public class matrixReverseRow {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0, iRet = 0;
        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of cols");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        mobj.Accept();
        mobj.Display();
        mobj.reverseRows();
        mobj = null;
        System.gc();

    }
}