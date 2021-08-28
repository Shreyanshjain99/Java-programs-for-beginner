import java.util.*;

public class anagram {
    public static void main(String args[]) {
        Scanner scan =new Scanner (System.in);
        Boolean result;
        String str1,str2;
        str1 =scan.nextLine();
        str2=scan.nextLine();

        
        if(str1.length()==str2.length())
        {
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            result=Arrays.equals(arr1,arr2);
            if (result){
                System.out.println("Yes anagram");}
        }
        else
        {
            System.out.println("No not an anagram");
        }
        
        scan.close();
    }
}
