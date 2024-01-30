package main.component;

public class HDD extends Component{
    private String formFactor;
    private int capacity;

    public HDD(String model, String formFactor, int capacity) {
        super(model);
        this.formFactor = formFactor;
        this.capacity = capacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель HDD: " + getModel());
        System.out.println("Форм фактор: " + getFormFactor());
        System.out.println("Объем памяти (в гб): " + getCapacity());
        System.out.println();
    }

    public String getFormFactor() {
        return formFactor;
    }

    public int getCapacity() {
        return capacity;
    }
}