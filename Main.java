package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> ourCats = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", 2),
                new Cat("Vasilisa", 7),
                new Cat("Ciri", 1),
                new Cat("Matroskin", 4),
                new Cat("Riis", 6)));

        Collections.sort(ourCats);

        ListOfCatIterator iter = new ListOfCatIterator(ourCats);

        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

    }
}
