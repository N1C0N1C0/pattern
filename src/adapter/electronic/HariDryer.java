package adapter.electronic;

public class HariDryer implements V110{

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
