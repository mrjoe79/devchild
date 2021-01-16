import java.util.Scanner;
public class devchild2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 길이를 입력하세요:");
        int i  = sc.nextInt();
        System.out.print("세로 길이를 입력하세요:");
        int j = sc.nextInt();
        int z = i * j;
        if (z > 1000) {
            System.out.println("숫자가 너무 큽니다");
        }
        else{
            System.out.println("사각형의 넓이는 " + z + "입니다.");
        }
    }
}
