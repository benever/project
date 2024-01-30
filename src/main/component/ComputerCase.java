package main.component;

public class ComputerCase extends Component{
    private int maxSizeCPUFan;
    private int maxSizeVideoCard;
    private int maxSizeCaseFan;
    private String formFactorMotherboard;
    private int numberOfCompartmentsForHDD; // 3.5 type
    private int numberOfCompartmentsForSSD; // 2.5 type

    public ComputerCase(String model, int maxSizeCPUFan, int maxSizeVideoCard, int maxSizeCaseFan, String formFactorMotherboard, int numberOfCompartmentsForHDD, int numberOfCompartmentsForSSD) {
        super(model);
        this.maxSizeCPUFan = maxSizeCPUFan;
        this.maxSizeVideoCard = maxSizeVideoCard;
        this.maxSizeCaseFan = maxSizeCaseFan;
        this.formFactorMotherboard = formFactorMotherboard;
        this.numberOfCompartmentsForHDD = numberOfCompartmentsForHDD;
        this.numberOfCompartmentsForSSD = numberOfCompartmentsForSSD;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель корпуса: " + getModel());
        System.out.println("Максимальная высота вентилятора процессора: " + getMaxSizeCPUFan());
        System.out.println("Максимальная длина видеокарты: " + getMaxSizeVideoCard());
        System.out.println("Максимальная ширина вентилятора в корпусе: " + getMaxSizeCaseFan());
        System.out.println("Форм фактор материнской платы: " + getFormFactorMotherboard());
        System.out.println("Количество разъемов для HDD: " + getNumberOfCompartmentsForHDD());
        System.out.println("Количество разъемов для SSD: " + getNumberOfCompartmentsForSSD());
        System.out.println();
    }

    public int getMaxSizeCPUFan() {
        return maxSizeCPUFan;
    }

    public int getMaxSizeVideoCard() {
        return maxSizeVideoCard;
    }

    public int getMaxSizeCaseFan() {
        return maxSizeCaseFan;
    }

    public String getFormFactorMotherboard() {
        return formFactorMotherboard;
    }

    public int getNumberOfCompartmentsForHDD() {
        return numberOfCompartmentsForHDD;
    }

    public int getNumberOfCompartmentsForSSD() {
        return numberOfCompartmentsForSSD;
    }
}