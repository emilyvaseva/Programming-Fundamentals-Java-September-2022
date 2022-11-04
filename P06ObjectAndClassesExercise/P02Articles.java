package P06ObjectAndClassesExercise;

import java.util.Scanner;

public class P02Articles {

    public static class Article {

        private String title;
        private String content;
        private String author;


        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit (String newContent){
            this.content = newContent;
        }

        public void changeAuthor (String newAuthor) {
            this.author = newAuthor;
        }

        public void rename (String newTitle) {
            this.title = newTitle;
        }


        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int commandCount = 1; commandCount <= n; commandCount++) {
            String command = scanner.nextLine();

            if (command.contains("Edit")) {
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            } else if (command.contains("Rename")) {

                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            } else if (command.contains("ChangeAuthor")) {

                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
        }


        System.out.println(article.toString());
    }
}
