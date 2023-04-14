package proxy;

import proxy.util.Browser;
import proxy.util.BrowserProxy;
import proxy.util.IBrowser;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();

        IBrowser browserP = new BrowserProxy("www.naver.com");
        browserP.show();
        browserP.show();
        browserP.show();


    }
}
