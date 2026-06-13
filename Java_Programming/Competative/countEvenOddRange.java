class Logic {
    public void countEvenOddRange(int iNo) {
        int evenCount = 0;
        int oddCount = 0;
        int iCnt = 0;
        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if (iCnt % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count is : " + evenCount);
        System.out.println("Odd Count is : " + oddCount);
    }
}



public class countEvenOddRange {
    public static void main(String args [] ) {
       Logic obj = new Logic();
       obj.countEvenOddRange(10);
        
    }
}