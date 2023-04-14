package adapter.electronic;

public class SocketAdapter implements V110{

    private V220 v220;

    public SocketAdapter(V220 v220){
        this.v220 = v220;
    }
    @Override
    public void powerOn() {
        v220.connect();
    }
}
