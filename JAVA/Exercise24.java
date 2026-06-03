import java.util.ArrayList;
import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students =
                new ArrayList<>();

        System.out.print(
                "How many names to add? "
        );

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print(
                    "Enter Name " + i + ": "
            );

            students.add(
                    sc.nextLine()
            );
        }

        System.out.println(
                "\nStudent Names:"
        );

        for (String name : students) {
            System.out.println(name);
        }

        sc.close();
    }
}