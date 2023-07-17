package ua.hillel.hw22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		try (Socket socket = new Socket("127.0.0.1", 8080);
				Scanner scanner = new Scanner(System.in)) {
			

			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			System.out.println("Print request to server");

			while (true) {
				

				String text = scanner.nextLine();

				if ("exit".equals(text)) {
					break;
				}
				dos.writeUTF(text);
				dos.flush();
				
				String server = dis.readUTF();
			
				System.out.println(server);
			}
		}

		
	}

}
