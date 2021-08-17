package pl.arczi;

import java.util.*;

public class Loop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String correctWord = "exit";
        boolean guessWord = false;

        int count = 0;
        Set<String> setWithWords = new LinkedHashSet<>();
        while (!guessWord) {
            System.out.println("Zgadnij wyraz: ");
            String word = scan.nextLine();
            setWithWords.add(word);
            count++;

            if (!(correctWord.equals(word))) {
                System.out.println("Zły wyraz, podaj jeszcze raz:");
            } else {
                System.out.println("Exit to poprawy wyraz. Gratulacje.");
                System.out.println("Rozmiar kolekcji: " + setWithWords.size());
                System.out.println("Podanych napisow: " + count);
                guessWord = true;
                System.out.println(setWithWords);
            }
        }
    }
}







