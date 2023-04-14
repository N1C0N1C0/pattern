package adapter;

import adapter.electronic.*;

public class Main {
    public static void main(String[] args) {
        HariDryer hariDryer = new HariDryer();
        connect(hariDryer);

        Cleaner cleaner = new Cleaner();
        V110 adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        V110 airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    public static void connect(V110 v110){
        v110.powerOn();
    }
}
