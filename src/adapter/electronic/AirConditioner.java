package adapter.electronic;

public class AirConditioner implements V220{

    @Override
    public void connect() {
        System.out.println("에어컨 220V on");
    }
}
