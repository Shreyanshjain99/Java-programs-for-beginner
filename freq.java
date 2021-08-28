import java.util.*;

public class freq{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String values = scan.nextLine();
        int count=0;
        char[] arrd=values.toCharArray();
        char[] arr=values.toCharArray();
        for(int i=0;i<values.length();i++)
        {
            for(int j=0;j<values.length();j++)
            {
                if(arr[i] == arrd[j])
                {
                    count++;
                    arrd[j]='0';
                }
            }
            if(count>0)
            {
            System.out.print("Frequency of "+values.charAt(i));
            System.out.println(" = "+count);
            }
            count=0;
        }
        scan.close();
}
}