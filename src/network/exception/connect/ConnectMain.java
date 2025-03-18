package network.exception.connect;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectMain {

    public static void main(String[] args) {
        unknownHostEx1();
        unknownHostEx2();
    }

    private static void unknownHostEx1() {
        try {
            Socket socket = new Socket("999.999.999.999", 80);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void unknownHostEx2() {
        try {
            Socket socket = new Socket("google.gogo", 80);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void connectionRefused() {
        try {
            Socket socket = new Socket("localhost", 45678);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
