import com.tw.party.*;
import com.tw.record.Reader;

import java.io.IOException;
import java.util.List;

class PrintLabel {
    public static void main(String[] path) throws IOException {
        List<Guest> guests = Reader.readGuestRecords(path[0]);

        System.out.println("Printing all labels");
        LabelGenerator labelGenerator = new DefaultLabelGenerator();
        List<Label> defaultLabels = labelGenerator.generate(guests);
        defaultLabels.forEach(System.out::println);

        System.out.println("=========================================");

        System.out.println("Printing labels for only bangladesh");
        labelGenerator = new CountryLabelGenerator("Bangladesh");
        List<Label> countrySpecificLabels = labelGenerator.generate(guests);
        countrySpecificLabels.forEach(System.out::println);
    }
}