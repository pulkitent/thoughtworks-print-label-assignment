import com.tw.gurgaon.*;

class LabelPrintApplication {
    public static void main(String s[]) {
        Name name = new Name("Pulkit", "Gupta");
        Address address = new Address("10-C", "Delhi", "India");
        Guest guest = new Guest(name, Gender.MALE, 23, address);

        Printer printer = new Printer();
        Label label = new Label(guest);

        String printedLabel = printer.print(label, Template.ORIGINAL);
        System.out.println(printedLabel);

        String printedLabelInReverse = printer.print(label, Template.ORIGINALREVERSE);
        System.out.println(printedLabelInReverse);

        String anotherPrintedLabel = printer.print(label, Template.WITHCOUNTRY);
        System.out.println(anotherPrintedLabel);

        String anotherPrintedLabelWithCountryInReverse = printer.print(label, Template.WITHCOUNTRYREVERSE);
        System.out.println(anotherPrintedLabelWithCountryInReverse);
    }
}