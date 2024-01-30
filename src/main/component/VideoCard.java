package main.component;

public class VideoCard extends Component{
    private int fan;
    private int VRAM;
    private int watt;
    private int size;

    public VideoCard(String model, int fan, int VRAM, int watt, int size) {
        super(model);
        this.fan = fan;
        this.VRAM = VRAM;
        this.watt = watt;
        this.size = size;
    }

    @Override
    public void printInfo() {
        System.out.println("Модель видеокарты: " + getModel());
        System.out.println("Количество вентиляторов: " + getFan());
        System.out.println("Объем памяти (в гб): " + getVRAM());
        System.out.println("Энергопотребление: " + getWatt());
        System.out.println("Длина видеокарты (в мм): " + getSize());
        System.out.println();
    }



    public int getFan() {
        return fan;
    }

    public int getVRAM() {
        return VRAM;
    }

    public int getWatt() {
        return watt;
    }

    public int getSize() {
        return size;
    }
}