import java.util.*;

public class vowels {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);

            String vow="aaaeeeeiiiiioooooouuuuuuuu";//a=97,e=101,i=105,o=111,u=117
            //abcdefghijklmnopqrstuvwxyz
            String output="";
            String input=scan.nextLine();//abcde
            System.out.println(input);
            for(int i=0;i<input.length();i++)
            {
                output=output+vow.charAt(input.charAt(i) - 'a');
            }
            System.out.println(output);
            scan.close();
}
}
//97-122
//b=98