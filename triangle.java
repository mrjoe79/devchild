import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("밑변 숫자를 입력하세요:");
        int i  = sc.nextInt();
        if (i > 1000) {
            System.out.print("1000이하의 숫자를 입력하세요");
        }
        System.out.print("높이 숫자를 입력하세요");
        int j = sc.nextInt();
        if (j > 1000) {
            System.out.print("1000이하의 숫자를 입력하세요");
        }
        int triangle = (i * j)/2;
        System.out.println(Math.round(triangle*1000)/1000.0);
    }
}

