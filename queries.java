import java.util.Scanner;

public class queries {
    public static void main(String[] args) {

        int n,a,b,i,sum,sumt,s;
        sum=1;
        sumt=0;
        s=0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Numbers ...");

        do {
            System.out.print("n : ");
            n = inp.nextInt();

        }while(n<1||n>15);

        do{
            System.out.print("a : ");
            a = inp.nextInt();

        }while(a<0||a>50);

        do{
            System.out.print("b :");
            b = inp.nextInt();
        }while (b<0||b>50);


        for(i=1;i<=n;i++){

            sum*=2;
            if(i==1){
                sum=1;
            }

            sumt+=sum;

            s=a+sumt*b;


            System.out.print("S"+i+"= "+s+ " ");



        }




    }
}
