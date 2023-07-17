package ua.hillel.hw22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

	public static void main(String[] args) throws IOException {
		
		Map<Long, Socket> socketPull = new HashMap<>();

		try (ServerSocket serverSocket = new ServerSocket(8080)) {

			while (true) {
				Socket socket = serverSocket.accept();
				Thread clientThread = new Thread(new ServerClient(socket));
				
				socketPull.put(clientThread.getId(), socket);
				
				
				clientThread.setDaemon(true);
				clientThread.start();
			}
		}

	}

}
