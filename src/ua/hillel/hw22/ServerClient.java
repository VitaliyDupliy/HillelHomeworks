package ua.hillel.hw22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerClient implements Runnable {
	
	private final Socket socket;
	
	public ServerClient(Socket socket) {
		this.socket = socket;
	}

	
	public Socket getSocket() {
		return socket;
	}


	@Override
	public void run() {
		
		try (DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {
					
										
				while(true) {
					String clientMessage = dis.readUTF();
					
					System.out.println("from client: " + clientMessage);
					
					dos.writeUTF("Server:" + clientMessage);
					dos.flush();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 

	}

}
