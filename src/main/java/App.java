import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String s = inputString();
        //Bài 1: In ra cac ký tự viết hoa
        printUppercase(s);
        //Bài 2: In ra các ký tự không phải số
        printLetter(s);
        //Bài 3: Kiểm tra ký tự c trong chuỗi s
        char c = inputChar();
        int count = countChar(s, c);
        if (count > 0) {
            System.out.format("Có %d ký tự %s trong chuỗi", count, c);
        } else System.out.format("Không có ký tự %s nào trong chuỗi", c);
    }

    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String s = sc.nextLine();
        return s;
    }
    public static char inputChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ký tự cần kiểm ra trong chuỗi: ");
        char c = sc.next().charAt(0);
        return c;
    }

    public static void printUppercase(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i)))
                System.out.println(s.charAt(i));
    }

    public static void printLetter(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                System.out.println(s.charAt(i));
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c) {
                count++;
            }
        return count;
    }
}

