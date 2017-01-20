/**
 * Created by localadmin on 1/20/17.
 */
public class FanBlade extends Part{
    int numberOfBlades;
    int diameterInCentimeters;

    FanBlade(String manufacturer, int partNumber, String description, int numberOfBlades, int diameterInCentimeters, int price) {
        super(manufacturer, partNumber, description, price);
        this.numberOfBlades = numberOfBlades;
        this.diameterInCentimeters = diameterInCentimeters;
    }

    String fullDescription(){
        return super.fullDescription() +
                ", numberOfBlades: " + numberOfBlades +
                ", diameterInCentimeters: " + diameterInCentimeters;
    }

}
