class FileDownloadSimulation {
    public static void main(String[] args) {
        Thread part1 = new Thread(() -> {
            try {
                System.out.println("Part 1 downloading...");
                Thread.sleep(2000); // simulate download time
                System.out.println("Part 1 completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread part2 = new Thread(() -> {
            try {
                System.out.println("Part 2 downloading...");
                Thread.sleep(2000); // simulate download time
                System.out.println("Part 2 completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        part1.start();
        part2.start();

        try {
            part1.join(); // wait for part1 to finish
            part2.join(); // wait for part2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("File download completed.");
    }
}
