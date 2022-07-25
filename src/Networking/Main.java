package Networking;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.instagram.com";
            InetAddress inetAddress = Inet4Address.getByName(url);
                System.out.println("Address: "+ Arrays.toString(inetAddress.getAddress()));
                    System.out.println("Host Address: "+ inetAddress.getHostAddress());
                        System.out.println("Is any local address?: "+ inetAddress.isAnyLocalAddress()); // check whether the inetAddress is wildcard address
                            System.out.println(("Is is a link to a local address?: " + inetAddress.isLinkLocalAddress())); // to check if the inetAddress is a link to a local address
                                System.out.println("HashCode: "+ inetAddress.hashCode());
    }
}
