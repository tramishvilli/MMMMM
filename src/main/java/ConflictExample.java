public class ConflictExample {
    public void processData() {
        System.out.println("Processing data in feature-branch-1...");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value: " + (i * 2));
        }
    }
}