import java.util.HashMap;
import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> students =
                new HashMap<>();

        System.out.print(
                "Number of Students: "
        );

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.print(
                "Enter ID to Search: "
        );

        int searchId = sc.nextInt();

        if (students.containsKey(searchId)) {

            System.out.println(
                    "Name: " +
                    students.get(searchId)
            );

        } else {

            System.out.println(
                    "ID Not Found"
            );
        }

        sc.close();
    }
}