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

    // protected void finalize() {
    // System.out.println("inside finalize method");
    // Arr = null;
    // System.gc();
    // }

    public void Accept() {
        int i = 0, j = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Elements in (0/1) :");

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

    public int TotalBookedSeat() {
        int i = 0, j = 0, iSum = 0;
        for (i = 0; i < Arr.length; i++) {
            for (j = 0; j < Arr[i].length; j++) {
                iSum = iSum + Arr[i][j];
            }
        }
        return iSum;
    }

    public void FullRow() {
        int i = 0, j = 0, iSum = 0;
        for (i = 0; i < Arr.length; i++) {
            for (j = 0; j < Arr[i].length; j++) {  
                iSum = iSum+ Arr[i][j];
            }
            if(iSum == Arr[i].length){
                System.out.println(i+"Row is Full");
            }
        }
    }

    public int MaxRowBooked() {
        int i = 0, j = 0, iSum = 0, iMax = 0, iTemp = 0;

        for (i = 0; i < Arr.length; i++) {
            for (j = 0; j < Arr[i].length; j++) {
                iSum = iSum + Arr[i][j];
            }
            if (iMax > iSum) {
                iMax = iSum;
                iTemp = i;
            }
        }

        return iTemp + 1;
    }
}

public class cinemaHallBooking {
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
        iRet = mobj.TotalBookedSeat();
        System.out.println("Total Seat Booked :" + iRet);

        iRet = mobj.MaxRowBooked();
        System.out.println("Row with max Booking:" + iRet);

        mobj.FullRow();

        mobj = null;
        System.gc();

    }
}