public class ConflictExample {
    public void processData() {
        System.out.println("Processing data in feature-branch-2...");
        String[] words = {"Hello", "World", "From", "Branch2"};
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
    }
}