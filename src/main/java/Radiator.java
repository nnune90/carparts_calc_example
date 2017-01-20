
public class Radiator extends Part{
    String coolantPressure;

    Radiator(String manufacturer, int partNumber, String description, String coolantPressure, int price) {
        super(manufacturer, partNumber, description, price);
        this.coolantPressure = coolantPressure;
    }

    String fullDescription(){
        return super.fullDescription() +
                ", coolantPressure: " + coolantPressure;
    }

}
