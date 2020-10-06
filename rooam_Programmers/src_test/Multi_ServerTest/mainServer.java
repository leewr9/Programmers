package Multi_ServerTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;

public class mainServer {
	private ServerSocket mainServer;
	private Socket user;
	private userSocket client;
	
	private HashSet<roomServer> rooms = new HashSet<>();
	private HashMap<String, userSocket> users = new HashMap<>();
	
	private String localHostAddress;
	private int Port;
	
	mainServer(){
		try {
			mainServer = new ServerSocket();
			mainServer.bind(new InetSocketAddress(localHostAddress, Port));
			user = mainServer.accept();
			client = new userSocket(user, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
