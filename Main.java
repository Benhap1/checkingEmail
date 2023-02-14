package practice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Wrong format of email";

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            emailList.add(input);
        }

        for (String email : emailList.getSortedEmails()) {
            System.out.println(email);
        }
    }
}
