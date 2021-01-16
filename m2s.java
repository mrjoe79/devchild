import java.util.Scanner;

public class m2s {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("분을 입력하세요:");
        i = sc.nextInt();

        if (i > 60) {
            System.out.print("1~60 이내로 입력해주세요");
        }
        else{
                System.out.println(i + " minutes is " + i * 60 + " seconds");
            }
        }
    }



