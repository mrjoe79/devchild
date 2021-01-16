import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요:");
        int i  = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요:");
        int j = sc.nextInt();
        System.out.println("입력한 두 수의 순서를 바꾸면 " + j + " 와 " + i + "입니다.");

    }
}
