/**
 * Created by localadmin on 1/20/17.
 */
public class Part {
    String manufacturer;
    int partNumber;
    String description;
    int price;

    public Part(String manufacturer, int partNumber, String description, int price) {
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.description = description;
        this.price = price;
    }

    boolean coolingSystemComponent() {
        if(manufacturer.equals("Ford Cooling") || manufacturer.equals("Ford radiator")) {
            return true;
        }
        return false;
    }

    boolean engineComponent() {
        if(manufacturer.equals("Ford Engine") || manufacturer.equals("Ford camshaft")) {
            return true;
        }
        return false;
    }

    String fullDescription() {
        return "manufacturer: " + manufacturer +
                ", partNumber: " + partNumber +
                ", description: " + description;
    }

    boolean taxExempt() {
        if(manufacturer.contains("Engine"))
        {return true;}
        return false;
    }

    int subTotal() {
        return price;
    }
}
