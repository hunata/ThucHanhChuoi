import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String s = inputString();
        s = s.trim();

        //Bài 1: In ra cac ký tự viết hoa
        printUppercase(s);
        System.out.println();

        //Bài 2: In ra các ký tự không phải số
        printLetter(s);
        System.out.println();

        //Bài 3: Kiểm tra ký tự c trong chuỗi s
        char ch = inputChar();
        int count = countChar(s, ch);
        if (count > 0) {
            System.out.format("Có %d ký tự %s trong chuỗi", count, ch);
        } else System.out.format("Không có ký tự %s nào trong chuỗi", ch);

        // Bài 4: Đếm chữ
        int c = countSpace(s);
        System.out.format("chuỗi gốm có %d từ", c + 1);

        // Bài 7: Đếm nguyen Am phụ âm
        countNguyenPhuAm(s);
    }

    public static String catSpace(String s) {
        s = s.trim();
        return s;
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
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
    }

    public static void printLetter(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                System.out.print(s.charAt(i));
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c) {
                count++;
            }
        return count;
    }

    public static void countNguyenPhuAm(String s) {
        int na = 0;
        int pa = 0;
        s.toLowerCase();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'u') {
                na = na + 1;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                pa = pa + 1;
            }
        System.out.println(na);
        System.out.println(pa);
    }

    public static int countSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isWhitespace(s.charAt(i)) && !Character.isWhitespace(s.charAt(i + 1))) {
                count = count + 1;
            }
        }
        return count;
    }
}

