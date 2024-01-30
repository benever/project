package main.component;

public class CPU extends Component{
    private String socket;
    private double clockSpeed;
    private int numberOfCores;
    private int watt;

    public CPU(String model, String socket, double clockSpeed, int numberOfCores, int watt) {
        super(model);
        this.socket = socket;
        this.clockSpeed = clockSpeed;
        this.numberOfCores = numberOfCores;
        this.watt = watt;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель процессора: " + getModel());
        System.out.println("Сокет: " + getSocket());
        System.out.println("Тактовая частота: " + getClockSpeed());
        System.out.println("Энергопотребление: " + getWatt());
        System.out.println("Количество ядер: " + getNumberOfCores());
        System.out.println();
    }

    public String getSocket() {
        return socket;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getWatt() {
        return watt;
    }
}