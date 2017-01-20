import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Calculator {
    ArrayList<Part> partsOrdered;

    Calculator(ArrayList<Part> partsOrdered){
        this.partsOrdered = partsOrdered;
    }

    double calculateTotal() {
        int subTotal = calculateSubTotal(partsOrdered);

        List<Part> nonTaxExemptParts = partsOrdered.stream().filter(b -> b.taxExempt() == false).collect(Collectors.toList());
        double taxableTotal = calculateNonTaxExemptTotal(nonTaxExemptParts);


        List<Part> taxExemptParts = partsOrdered.stream().filter(b -> b.taxExempt()).collect(Collectors.toList());
        double taxableTotal = calculateNonTaxExemptTotal(nonTaxExemptParts);

        return total;
    }

    int calculateSubTotal(ArrayList<Part> parts) {
        return parts.stream()
                .mapToInt(b -> b.price)
                .sum();
    }

    int calculateTaxExemptTotal(ArrayList<Part> parts) {
        int total;



        int taxableSubTotal = calculateSubTotal(nonTaxExemptParts);

        return total;
    }

    double calculateNonTaxExemptTotal(List<Part> parts) {
        int total;

        return total;
    }
}
