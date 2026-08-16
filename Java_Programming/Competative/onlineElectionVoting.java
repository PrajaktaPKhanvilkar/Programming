import java.util.*;
public class onlineElectionVoting {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number of Votes N: ");
        int nVotes = sobj.nextInt();
        if(nVotes<=0){
            System.out.println("Enter Valid Number of votes");
        }

        System.out.println("Enter Voters IDs: ");
        int voteArr[] = new int[nVotes];
        int i =0;
        for(i = 0 ; i<voteArr.length; i++){
            voteArr[i] = sobj.nextInt();
            if(voteArr[i] <= 0){
                System.out.println("IDs must be non-negative");
                break;
            }
        }
        int temp = 0, validVotes = 0, inValidVotes = 0;
        temp = voteArr[0];
        for(i=0;i<voteArr.length;i++){
            
            if(temp == voteArr[i]){
                temp = voteArr[i];
                inValidVotes++;
            }else{
                validVotes++;
            }
        }

        System.out.println("Valid Votes are: "+validVotes);
        System.out.println("Invalid Votes are: "+ inValidVotes);
    }
}
