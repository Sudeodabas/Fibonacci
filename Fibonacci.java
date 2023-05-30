import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç elemanlı fibonacci serisi istersiniz: ");
        int n = inp.nextInt();

        int a1, a2,temp;
        a1 = 0;
        a2 = 1;
        temp=0;
        for(int i=1;i<=n;i++){
            System.out.print(a1+" ");
            temp=a1+a2;
            a1=a2;
            a2=temp;
        }
    }
}
