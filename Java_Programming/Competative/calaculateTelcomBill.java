import java.util.*;

public class calaculateTelcomBill {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int callCharge = 0;

        System.out.println("Enter the Call duration in minutes");
        int duration = sobj.nextInt();

        if(duration<= 0){
            System.out.println("Enter Valid Duration in minutes");
        }else if(duration >0 && duration <=5){
            callCharge = 0;
        }
        else if(duration >5 && duration <=15){
            callCharge = callCharge+ (duration -5) *1 ;
        }else{
            callCharge =  callCharge+ (duration -5) *2;
        }

        System.out.println("Call Duration <minutes>: "+duration);
        System.out.println("Total Call Charge: "+callCharge);
    }
}
