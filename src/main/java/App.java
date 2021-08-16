import java.util.Scanner;

    public class App {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập vào chuỗi ");
            String s = sc.nextLine();
            System.out.println(s);
            for (int i =0; i<s.length(); i++)
                if (s.charAt(i)>='A'&& s.charAt(i)<'Z'){
                    System.out.println(s.charAt(i));
                }
        }
    }

