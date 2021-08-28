import java.util.Scanner;

class facto {
    public static void main(String[] args) {
        int number,i,ans=1;
        Scanner scan =new Scanner(System.in);
        number=scan.nextInt();//6
        scan.close();
        //ans=number;
        for(i=number;i>0;i--)//6,5,4,3,2,1
        {
            ans=ans*i;
        }
        System.out.println(ans);
        
    }
}
