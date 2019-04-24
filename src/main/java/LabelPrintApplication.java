import com.tw.gurgaon.Label;

import java.util.LinkedList;

import static com.tw.gurgaon.Salutation.Mr;

class LabelPrintApplication {
    public static void main(String s[]) {

        Label label1 = new Label("Pulkit", "Gupta", Mr);
        Label label2 = new Label("Pulkit", "Gupta", Mr);
        Label label3 = new Label("Pulkit", "Gupta", Mr);
        Label label4 = new Label("Pulkit", "Gupta", Mr);
        Label label5 = new Label("Pulkit", "Gupta", Mr);

        LinkedList<Label> labels = new LinkedList<>();
        labels.add(label1);
        labels.add(label2);
        labels.add(label3);
        labels.add(label4);
        labels.add(label5);

        for (Label label : labels) {
            System.out.println(label.print());
        }

        for (Label label : labels) {
            System.out.println(label.printReverse());
        }
    }
}
