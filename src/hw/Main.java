package hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Family> families = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            families.add(new FamilyCreate()
                    .addLastName(" Family " + i)
                    .addFather(new Person(" Father " + i, new Random().nextInt(50) + 24))
                    .addMother(new Person(" Mather" + i, new Random().nextInt(30) + 18))
                    .addChildren(new Person(" Child1 " + i, new Random().nextInt(5) + 1))
                    .addChildren(new Person(" Child2 " + i, new Random().nextInt(3)))
                    .createFamily());
        }
        try {
            FileWriter file = new FileWriter("result.json");
            file.write(families.toString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(families);

    }
}

