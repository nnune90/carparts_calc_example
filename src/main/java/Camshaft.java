
public class Camshaft extends Part{
    int duration;
    int lift;
    int timing;

    public Camshaft(String manufacturer, int partNumber, String description, int duration, int lift, int timing, int price) {
        super(manufacturer, partNumber, description, price);
        this.duration = duration;
        this.lift = lift;
        this.timing = timing;
    }

    String fullDescription(){
        return super.fullDescription() +
                ", duration: " + duration +
                ", lift: " + lift +
                ", timing: " + timing;
    }

}
