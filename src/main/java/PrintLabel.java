import com.tw.party.*;
import com.tw.record.Reader;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class PrintLabel {
    public static void main(String[] path) throws IOException {
        if (path.length == 0) {
            path = new String[10];
            path[0] = "/Users/pulkit.gupta/Desktop/records.csv";
        }

        List<Guest> guests = Reader.readGuestRecords(path[0]);
        Scanner scanner = new Scanner(System.in);
        printMenu();

        int choice = scanner.nextInt();
        LabelGenerator labelGenerator = new DefaultLabelGenerator();

        switch (choice) {
            case 1:
                List<Label> defaultLabels = labelGenerator.generate(guests);
                defaultLabels.forEach(System.out::println);
                break;
            case 2:
                System.out.println("Enter Country");
                String country = scanner.next();
                labelGenerator = new CountryLabelGenerator(country);
                List<Label> countrySpecificLabels = labelGenerator.generate(guests);
                countrySpecificLabels.forEach(System.out::println);
                break;
            case 3:
                System.out.println("Enter Age");
                int age = scanner.nextInt();
                labelGenerator = new AgeLabelGenerator(age);
                List<Label> ageSpecificLabels = labelGenerator.generate(guests);
                ageSpecificLabels.forEach(System.out::println);
                break;
        }
    }

    private static void printMenu() {
        System.out.println("============================");
        System.out.println("1. Print label for default");
        System.out.println("2. Print label for Country");
        System.out.println("3. Print label for age");
        System.out.println("============================");
        System.out.println("Enter your choice");
    }
}