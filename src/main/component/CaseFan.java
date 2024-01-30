package main.component;

public class CaseFan extends Component{
    private int size;

    public CaseFan(String model, int size) {
        super(model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }


    @Override
    public void printInfo() {
        System.out.println("Модель вентилятора корпуса: " + getModel());
        System.out.println("Ширина вентилятора: " + getSize());
        System.out.println();
    }
}