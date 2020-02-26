package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;

import org.json.JSONArray;

import model.dao.TuyenSinhDao;

public class Server {
	static ResultSet result;
	static ServerSocket server;
	static DataOutputStream out;
	static DataInputStream in;
	static Socket socket;

	public static void main(String[] args) throws IOException {

		try {
			server = new ServerSocket(7000);
			String string;
			System.out.println("Khởi chạy máy chủ thành công");
			while (true) {
				socket = server.accept();
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());
				string = in.readUTF();
				String[] parts = string.split("#");
				String search = parts[0];
				String jradio = parts[1];
				String id_cum = parts[2];
				String id_nam = parts[3];
				TuyenSinhDao tuyenSinhDao = new TuyenSinhDao();
				result = tuyenSinhDao.view(search, jradio, Integer.parseInt(id_cum), Integer.parseInt(id_nam));

				JSONArray jsonArray = new JSONArray();

				while (result.next()) {
					int total_rows = result.getMetaData().getColumnCount();
					String rows[] = new String[total_rows];
					for (int i = 0; i < total_rows; i++) {
						rows[i] = result.getString(i + 1);
					}
					jsonArray.put(rows);
				}
				out.writeUTF(jsonArray.toString());
				out.flush();
			}

		} catch (NumberFormatException e) {
			out.writeUTF("Vui lòng nhập số");
			out.flush();
		} catch (Exception e) {
			out.writeUTF(e.getMessage());
			out.flush();
		} finally {
			out.close();
			in.close();
			socket.close();
			server.close();
		}
	}

}
