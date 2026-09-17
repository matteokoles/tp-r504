import java.io.*;
import java.net.*;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("adresse=" + addr.getHostName());

        String s = "Hello World";
        byte[] data = s.getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length, addr, 1234);
        DatagramSocket sock = new DatagramSocket();
        sock.send(packet);

        // on attend la réponse du serveur
        DatagramPacket reponse = new DatagramPacket(new byte[1024], 1024);
        sock.receive(reponse);
        String str = new String(reponse.getData(), 0, reponse.getLength());
        System.out.println("Reponse du serveur : " + str);

        sock.close();
    }
}
