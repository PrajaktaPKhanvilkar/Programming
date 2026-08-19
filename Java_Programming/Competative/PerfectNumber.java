import java.util.Scanner;
class NumberX{
   public boolean  CheckPerfect(int iNo){
        // Logic
        int iCnt = 0;
        int iSum =0;
        
        for(iCnt=1 ; iCnt <= (iNo/2) ; iCnt++){
            if((iNo % iCnt) == 0){
                iSum = iSum + iCnt;
            }
            if(iSum > iNo){
                break;
            }
        }
        if(iSum == iNo){
            return true;
        }
        else{
            return false;
        }
   }
}
public class PerfectNumber
 {
        public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;
        System.out.println("Enter number");
        iValue = sobj.nextInt();
        NumberX nObj = new NumberX();
        bRet = nObj.CheckPerfect(iValue);
        if(bRet == true){
            System.out.printf("%d is a perfect number", iValue);
        }
        else{
            System.out.printf("%d is not a perfect number", iValue);
        }
    }
}

// Time Complexity :O(N/2)
// Where N >= 0