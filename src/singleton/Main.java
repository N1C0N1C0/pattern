package singleton;

import singleton.socket.AClazz;
import singleton.socket.BClazz;
import singleton.socket.SocketClient;

public class Main {
    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = aClazz.getSocketClient();

        System.out.println("두개의 객체 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
