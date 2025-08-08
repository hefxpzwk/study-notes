import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        System.out.print("나이를 입력하세요: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력하세요: ");
        name = sc.nextLine();

        System.out.printf("당신의 나이는 %d살이고 이름은 '%s'입니다.", age, name);
    }
}
