package main.component;

public class Motherboard extends Component{
    private String socket;
    private String chipset;
    private String formFactor;
    private int numberOfCompartmentsForM2;

    public Motherboard(String model, String socket, String chipset, String formFactor, int numberOfCompartmentsForM2) {
        super(model);
        this.socket = socket;
        this.chipset = chipset;
        this.formFactor = formFactor;
        this.numberOfCompartmentsForM2 = numberOfCompartmentsForM2;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель материнской платы: " + getModel());
        System.out.println("Сокет для процессора: " + getSocket());
        System.out.println("Чипсет: " + getChipset());
        System.out.println("Форм фактор: " + getFormFactor());
        System.out.println("Количество разъемов для SSD M2: " + getNumberOfCompartmentsForM2());
        System.out.println();
    }

    public String getSocket() {
        return socket;
    }

    public String getChipset() {
        return chipset;
    }


    public String getFormFactor() {
        return formFactor;
    }

    public int getNumberOfCompartmentsForM2() {
        return numberOfCompartmentsForM2;
    }
}