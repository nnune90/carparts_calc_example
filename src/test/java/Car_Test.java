import org.junit.Test;

//import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Car_Test {
    @Test
    public void carEngine_initialize() {
        CarEngine ce = new CarEngine("Ford", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 1);
        assertEquals("Ford", ce.manufacturer);
        assertEquals(12345, ce.partNumber);
        assertEquals("F150 Super Duty Engine", ce.description);
        assertEquals("displacement stuff", ce.displacement);
        assertEquals("250 Pa", ce.compressionRatio);
        assertTrue(ce.petrolEngine);
        assertFalse(ce.dieselEngine);
    }

    @Test
    public void radiator_initialize() {
        Radiator radiator = new Radiator("Ford", 54321, "cool radiator", "150 psi", 1);
        assertEquals("Ford", radiator.manufacturer);
        assertEquals(54321, radiator.partNumber);
        assertEquals("cool radiator", radiator.description);
        assertEquals("150 psi", radiator.coolantPressure);
    }

    @Test
    public void FanBlade_initialize() {
        FanBlade fb = new FanBlade("Ford Cooling", 987, "best fan blade ever", 4, 15, 1);
        assertEquals("Ford Cooling", fb.manufacturer);
        assertEquals(987, fb.partNumber);
        assertEquals("best fan blade ever", fb.description);
        assertEquals(4, fb.numberOfBlades);
        assertEquals(15, fb.diameterInCentimeters);
    }

    @Test
    public void Camshaft_initalize() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 1);
        assertEquals("Ford camshaft", camshaft.manufacturer);
        assertEquals(345, camshaft.partNumber);
        assertEquals("megan fox camshaft", camshaft.description);
        assertEquals(12, camshaft.duration);
        assertEquals(2, camshaft.lift);
        assertEquals(5, camshaft.timing);
    }

    @Test
    public void carEngine_returnFullDescription() {
        CarEngine ce = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        assertEquals("manufacturer: Ford Engine, partNumber: 12345, description: F150 Super Duty Engine, displacement: displacement stuff, compressionRatio: 250 Pa, petrolEngine: true, dieselEngine: false", ce.fullDescription());
    }

    @Test
    public void radiator_returnFullDescription() {
        Radiator rad = new Radiator("Ford radiator", 12345, "cool radiator", "150 psi", 500);
        assertEquals("manufacturer: Ford radiator, partNumber: 12345, description: cool radiator, coolantPressure: 150 psi", rad.fullDescription());
    }

    @Test
    public void FanBlade_returnFullDescription() {
        FanBlade fb = new FanBlade("Ford Cooling", 987, "best fan blade ever", 4, 15, 5);
        assertEquals("manufacturer: Ford Cooling, partNumber: 987, description: best fan blade ever, numberOfBlades: 4, diameterInCentimeters: 15", fb.fullDescription());
    }

    @Test
    public void camShaft_returnFullDescription() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 6969);
        assertEquals("manufacturer: Ford camshaft, partNumber: 345, description: megan fox camshaft, duration: 12, lift: 2, timing: 5", camshaft.fullDescription());
    }

    @Test
    public void CarEngine_determineCoolingSystemComponent() {
        CarEngine ce = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        assertFalse(ce.coolingSystemComponent());
    }

    @Test
    public void radiator_determineCoolingSystemComponent() {
        Radiator rad = new Radiator("Ford radiator", 12345, "cool radiator", "150 psi", 500);
        assertTrue(rad.coolingSystemComponent());
    }

    @Test
    public void FanBlade_determineCoolingSystemComponent() {
        FanBlade fb = new FanBlade("Ford Cooling", 987, "best fan blade ever", 4, 15, 500);
        assertTrue(fb.coolingSystemComponent());
    }

    @Test
    public void camShaft_determineCoolingSystemComponent() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 500);
        assertFalse(camshaft.coolingSystemComponent());
    }

    @Test
    public void CarEngine_determineEngineComponent() {
        CarEngine ce = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        assertTrue(ce.engineComponent());
    }

    @Test
    public void radiator_determineEngineComponent() {
        Radiator rad = new Radiator("Ford radiator", 12345, "cool radiator", "150 psi", 300);
        assertFalse(rad.engineComponent());
    }

    @Test
    public void FanBlade_determineEngineComponent() {
        FanBlade fb = new FanBlade("Ford Cooling", 987, "best fan blade ever", 4, 15, 300);
        assertFalse(fb.engineComponent());
    }

    @Test
    public void camShaft_determineEngineComponent() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 300);
        assertTrue(camshaft.engineComponent());
    }

    @Test
    public void part_Initalize() {
        Part part = new Part("Ford", 123, "new part", 99);
        assertEquals("Ford", part.manufacturer);
        assertEquals(123, part.partNumber);
        assertEquals("new part", part.description);
        assertEquals(99, part.price);
    }

    @Test
    public void part_fullDescription() {
        Part part = new Part("Ford", 123, "new part", 50);
        assertEquals("manufacturer: Ford, partNumber: 123, description: new part", part.fullDescription());
    }

    @Test
    public void Engine_taxExempt() {
        CarEngine ce = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        assertTrue(ce.taxExempt());
    }

    @Test
    public void radiator_taxExempt() {
        Radiator rad = new Radiator("Ford radiator", 12345, "cool radiator", "150 psi", 300);
        assertFalse(rad.taxExempt());
    }

    @Test
    public void FanBlade_taxExempt() {
        FanBlade fb = new FanBlade("Ford Cooling", 987, "best fan blade ever", 4, 15, 300);
        assertFalse(fb.taxExempt());
    }

    @Test
    public void camShaft_taxExempt() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 300);
        assertFalse(camshaft.taxExempt());
    }

    @Test
    public void camShaft_subTotal() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 300);
        assertEquals(300,camshaft.subTotal());
    }
    @Test
    public void Engine_subTotal() {
        CarEngine ce = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        assertEquals(5000,ce.subTotal());
    }

    @Test
    public void radiator_subTotal() {
        Radiator rad = new Radiator("Ford radiator", 12345, "cool radiator", "150 psi", 300);
        assertEquals(300,rad.subTotal());
    }

    @Test
    public void FanBlade_subTotal() {
        FanBlade fb = new FanBlade("Ford Cooling", 987, "best fan blade ever", 4, 15, 300);
        assertEquals(300,fb.subTotal());
    }

    @Test
    public void calculator_returnSubTotalEngines() {
        CarEngine ce1 = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        CarEngine ce2 = new CarEngine("Ford Engine", 12345, "F150 Super Duty Engine", "displacement stuff", "250 Pa", true, false, 5000);
        ArrayList<Part> partsBeingOrdered = new ArrayList<Part>();
        partsBeingOrdered.add(ce1);
        partsBeingOrdered.add(ce2);
        assertEquals(2, partsBeingOrdered.size());

        Calculator calc = new Calculator(partsBeingOrdered);
        assertEquals(10000.00, calc.calculateTotal(), 0);
    }

    @Test
    public void calculator_returnSubTotalCamshaft() {
        Camshaft camshaft = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 300);
        Camshaft camshaft2 = new Camshaft("Ford camshaft", 345, "megan fox camshaft", 12 , 2, 5, 300);
        ArrayList<Part> partsBeingOrdered = new ArrayList<Part>();
        partsBeingOrdered.add(camshaft);
        partsBeingOrdered.add(camshaft2);
        assertEquals(2, partsBeingOrdered.size());

        Calculator calc = new Calculator(partsBeingOrdered);
        assertEquals(660.00, calc.calculateTotal(), 0);
    }

}
