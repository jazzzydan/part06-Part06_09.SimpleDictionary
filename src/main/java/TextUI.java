import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start() {
//        while (true) {
//            System.out.print("Command: ");
//            String command = scanner.nextLine();
//            if (command.equals("end")) {
//                System.out.println("Bye bye!");
//                break;
//            } else if (command.equals("add")) {
//                System.out.print("Word: ");
//                String word = scanner.nextLine();
//                System.out.print("Translation: ");
//                String translation = scanner.nextLine();
//                dictionary.add(word, translation);
//            } else if (command.equals("search")) {
//                System.out.print("To be translated: ");
//                String word = scanner.nextLine();
//                String translation = dictionary.translate(word);
//                if (translation == null) {
//                    System.out.println("Word " + word + " was not found");
//                } else {
//                    System.out.println("Translation: " + translation);
//                }
//            } else {
//                System.out.println("Unknown command");
//            }
//        }

        // substituting "if" operator with "switch"

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    return; // Exit the method and the loop
                case "add":
                    System.out.print("Word: ");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    dictionary.add(word, translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String wordToTranslate = scanner.nextLine();
                    String translationResult = dictionary.translate(wordToTranslate);
                    if (translationResult == null) {
                        System.out.println("Word " + wordToTranslate + " was not found");
                    } else {
                        System.out.println("Translation: " + translationResult);
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
