package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java219_network {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
			System.out.println("getHost():" + url.getHost()); // movie.daum.net
			System.out.println("getPort():" + url.getProtocol()); // https
			System.out.println("getPort():" + url.getPort()); // -1
			System.out.println("getPath():" + url.getPath()); // /moviedb/main
			System.out.println("getQuery():" + url.getQuery()); // movieId=3212		HTTP GET
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
