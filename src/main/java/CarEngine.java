/**
 * Created by localadmin on 1/20/17.
 */
public class CarEngine extends Part {
    String displacement;
    String compressionRatio;
    boolean petrolEngine;
    boolean dieselEngine;

    CarEngine(String manufacturer, int partNumber, String description, String displacement, String compressionRatio, boolean petrolEngine, boolean dieselEngine, int price){
        super(manufacturer, partNumber, description, price);
        this.displacement = displacement;
        this.compressionRatio = compressionRatio;
        this.petrolEngine = petrolEngine;
        this.dieselEngine = dieselEngine;
    }

    String fullDescription(){
        return super.fullDescription() +
                ", displacement: " + displacement +
                ", compressionRatio: " + compressionRatio +
                ", petrolEngine: " + petrolEngine +
                ", dieselEngine: " + dieselEngine;
    }

}
