package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        boolean isOn = true;
        Scanner input = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (isOn) {
            System.out.flush();
            System.out.println("Library");
            System.out.println("Welcome! What would you like to do?");
            System.out.println("1. Dodaj ksiazke.");
            System.out.println("2. Usun ksiazke.");
            System.out.println("3. Wypozycz ksiazke.");
            System.out.println("4. Zwroc ksiazke.");
            System.out.println("5. Lista ksiazek.");
            System.out.println("6. Szukaj ksiazki");
            System.out.println("7. Zapisz do pliku.");
            System.out.println("8. Wczytaj z pliku.");
            System.out.println("9. Wyjscie.");
            int choice = input.nextInt();

            switch (choice) {
                case 1:


                case 9:
                    isOn = false;
            }


        }
    }
}
