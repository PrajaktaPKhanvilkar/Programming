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
    public int MaxDiagonal() {
        int i = 0, j = 0, iMax = 0;
         for (i = 0; i < iRow; i++) {
            int primaryDiagonal = Arr[i][i];
            int secondaryDiagonal = Arr[i][iRow - 1 - i];

            if (primaryDiagonal > iMax) {
                iMax = primaryDiagonal;
            }
            if (secondaryDiagonal > iMax) {
                iMax = secondaryDiagonal;
            }
        }

        return iMax;
       
    }
}
public class matrixLargestDiagonal {
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
        iRet = mobj.MaxDiagonal();
        System.out.println("Largets Element is: "+ iRet);
        mobj = null;
        System.gc();

    }
}