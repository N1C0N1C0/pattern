package facade;

import facade.util.Ftp;
import facade.util.Reader;
import facade.util.SftpClient;
import facade.util.Writer;

public class Main {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,
                "/home/ect","text.tmp");
        sftpClient.connect();

        sftpClient.writer();

        sftpClient.read();

        sftpClient.disConnect();
    }
}
