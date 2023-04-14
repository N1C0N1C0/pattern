package adapter.electronic;

public class Cleaner implements V220{

    @Override
    public void connect() {
        System.out.println("청소기 220V on");
    }
}
