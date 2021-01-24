import java.util.Scanner;



public class hack {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();

        String temp = "";

        if(b > a-c ){
            temp = "do not advertise";
        }else if(b == a-c){
            temp = "does not matter";
        }else{
            temp = "advertise";
        }
        System.out.println(temp);
    }
}
