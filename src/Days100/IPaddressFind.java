package Days100;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddressFind {

	public static void main(String[] args) throws UnknownHostException {
	InetAddress inetAddress = InetAddress.getByName("www.amazon.in");
	System.out.println(inetAddress.getHostName());
	System.out.println(inetAddress.getHostAddress());
	

	}

}
