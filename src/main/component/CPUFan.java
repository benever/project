package main.component;

public class CPUFan extends Component{
    private String socket;
    private int size;

    public CPUFan(String model, String socket, int size) {
        super(model);
        this.socket = socket;
        this.size = size;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель вентилятора процессора: " + getModel());
        System.out.println("Сокет: " + getSocket());
        System.out.println("Высота (в мм): " + getSize());
        System.out.println();
    }

    public String getSocket() {
        return socket;
    }

    public int getSize() {
        return size;
    }
}