import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter \"break\" to exit");
        System.out.println("Enter a number: ");
        String input = reader.next();
        while (!input.equals("break")) {
            int i = Integer.parseInt(input);
            System.out.printf("0x%x\n", i);
            System.out.println("Enter new number: ");
            input = reader.next();

            //TODO: find out way to deal with input that is neither "break" nor an integer
        }
    }
}