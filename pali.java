import java.util.*;

public class pali {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String values=scan.nextLine();;
        String rev="";

        System.out.println("Enter string");//jalaj
        for(int i=values.length()-1;i>=0;i--)//5 43210
        {
            rev=rev+values.charAt(i);//4,3,2,1,0
        }      

        if(values.equals(rev))
        {
            System.out.println("Its a palidrome");
        }
        else{
            System.out.println("Not a palidrome");
        }
        scan.close();
    } 
    
}
