package main.component;

public class RAM extends Component{
    private String type; // ddr
    private int capacity;
    private int speed;

    public RAM(String model, String type, int capacity, int speed) {
        super(model);
        this.type = type;
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель RAM: " + getModel());
        System.out.println("Тип памяти: " + getType());
        System.out.println("Объем памяти (в гб): " + getCapacity());
        System.out.println("Тактовая частота: " + getSpeed());
        System.out.println();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }
}