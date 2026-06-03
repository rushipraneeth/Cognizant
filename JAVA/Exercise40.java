public class Exercise40 {

    public static void main(String[] args)
            throws Exception {

        long start =
                System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int taskId = i;

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread "
                                + taskId
                );
            });
        }

        long end =
                System.currentTimeMillis();

        System.out.println(
                "Time Taken: "
                        + (end - start)
                        + " ms"
        );
    }
}