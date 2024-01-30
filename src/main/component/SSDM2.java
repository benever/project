package main.component;

public class SSDM2 extends Component{
    private int capacity;

    public SSDM2(String model, int capacity) {
        super(model);
        this.capacity = capacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель SSD M2: " + getModel());
        System.out.println("Объем памяти (в гб): " + getCapacity());
        System.out.println();
    }

    public int getCapacity() {
        return capacity;
    }
}