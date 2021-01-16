import java.util.Scanner;
public class op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요:");
        int i  = sc.nextInt();
        if (i > 1000) {
            System.out.print("1000이하의 숫자를 입력하세요");
        }
        System.out.print("두번째 숫자를 입력하세요::");
        int j = sc.nextInt();
        if (j > 1000) {
            System.out.print("1000이하의 숫자를 입력하세요");
        }
        int append = i + j;
        int minus = i - j;
        int gop = i * j;
        int nanu = i/j;
        int per = i%j;
            System.out.println(i + "+" + j + "=" + append);
           System.out.println(i + "-" + j + "=" + minus);
            System.out.println(i + "*" + j + "=" + gop);
            System.out.println(i + "/" + j + "=" + nanu);
            System.out.println(i + "%" + j + "=" + per);
        }
    }

