import com.tw.gurgaon.*;

import java.util.LinkedList;
import java.util.List;

class LabelPrintApplication {
    public static void main(String s[]) {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);
        Label label = new Label(guest);

        Name anotherName = new Name("Rahul", "Gupta");
        Address anotherAddress = new Address("10-C", "Delhi", "Bangladesh");
        Guest anotherGuest = new Guest(anotherName, Gender.MALE, 25, anotherAddress);
        Label anotherLabel = new Label(anotherGuest);

        List<Label> labels = new LinkedList<>();
        labels.add(label);
        labels.add(anotherLabel);
        Printer printer = new Printer(labels);

        List<String> printedLabel = printer.printLabels(Template.DEFAULT, new PrintByDefault());
        System.out.println(printedLabel);

        List<String> printedLabelWithCountry = printer.printLabels(Template.COUNTRY, new PrintByCountry("India"));
        System.out.println(printedLabelWithCountry);
    }
}