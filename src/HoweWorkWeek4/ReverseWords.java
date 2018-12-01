package HoweWorkWeek4;

import java.util.Scanner;

public class ReverseWords {

    static Scanner scan = new Scanner(System.in);

    public String GetUserSentense() {
        String userSentense;
        while (true) {
            System.out.print("Please insert second name: ");
            if (scan.hasNext()) {
                userSentense = scan.nextLine();
                break;
            } else {
                scan.nextLine();
                System.out.println();
                System.out.println("Wrong input. Please re-enter your sentense. You can use only characters");
            }

        }
        return userSentense;
    }

    public void splitReverseAnPrintSentenceWords(String userSentense) {
        String[] sentenceArray = userSentense.split(" ");//split your sentence according to space

        for (String word : sentenceArray) {

            int i, len = word.length();
            StringBuilder wordWhole = new StringBuilder(len);

            for (i = (len - 1); i >= 0; i--) {
                wordWhole.append(word.charAt(i));

            }
            System.out.print(wordWhole.toString() + " ");
        }


    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String userSentense = reverseWords.GetUserSentense();
        reverseWords.splitReverseAnPrintSentenceWords(userSentense);
    }

}