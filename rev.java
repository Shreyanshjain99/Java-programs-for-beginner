import java.util.Scanner;

class rev{
    public static void main(String[] args) {
        Integer rev =0,number,right;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Number");
        number=scan.nextInt();

        while(number>0)
        {
            right=number%10;
            rev= rev*10+right;
            number=number/10;
        }
        System.out.println(rev);
        scan.close();
    }
}