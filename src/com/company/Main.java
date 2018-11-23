package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        Socket socket;
        try {
            socket = new Socket(InetAddress.getByName("54.37.232.177"), 8818);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
