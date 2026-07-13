import java.util.Scanner;

public class fsTest {
    public static void main(String[] args) {
        // 增加输入步骤
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩: ");
        int score = Integer.parseInt(scanner.nextLine());

        if (score >= 90 && score <= 100) {
            System.out.println("成绩是A");
        }
        else if (score >= 80 && score < 90) {
            System.out.println("成绩是B");
        }
        else if (score >= 70 && score < 80) {
            System.out.println("成绩是C");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("成绩是D");
        }
        else if (score >= 0 && score < 60) {
            System.out.println("成绩不及格");
        }
    }
}
