package main.component;

public class PowerUnit extends Component{
    private int wattage; // (VideoCard watt + CPU watt + 100) * 1.5

    public PowerUnit(String model, int wattage) {
        super(model);
        this.wattage = wattage;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель блока питания: " + getModel());
        System.out.println("Мощность: " + getWattage());
        System.out.println();
    }

    public int getWattage() {
        return wattage;
    }
}