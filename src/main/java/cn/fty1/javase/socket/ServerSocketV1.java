package cn.fty1.javase.socket;

import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketV1 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = ServerSocketFactory.getDefault().createServerSocket(12);
        Socket acept = serverSocket.accept();

    }

}
