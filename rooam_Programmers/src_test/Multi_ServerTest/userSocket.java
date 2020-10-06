package Multi_ServerTest;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class userSocket {
	private Socket user;
	private mainServer server;
	private InputStream in;
	private OutputStream out;

	userSocket(Socket s, mainServer ms) {
		this.user = s;
		this.server = ms;
	}

}
