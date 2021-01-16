import java.util.Scanner;
public class devchild2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i  = sc.nextInt();
        int j = sc.nextInt();
        int z = i * j;
        if (z > 1000) {
            System.out.println("숫자가 너무 큽니다");
        }
        else{
            System.out.println(z);
        }
    }
}
