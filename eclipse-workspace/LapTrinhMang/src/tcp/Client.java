package tcp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.json.JSONArray;
import org.json.JSONException;

import model.bean.CumThi;
import model.bean.Nam;
import model.dao.TuyenSinhDao;

public class Client extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JPanel modlePane;
	private JTextField textField;
	private static final long serialVersionUID = -6464587060272247354L;
	private DefaultTableModel tableModel = new DefaultTableModel();
	private JTable jtable = new JTable();
	private JButton btnTipTc;
	private ButtonGroup buttonGroup;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private TuyenSinhDao ts = new TuyenSinhDao();
	private List<String[]> arr = new ArrayList<String[]>();
	/*
	 * private static String search; private static String jradio; private
	 * static int id_cum; private static int id_nam;
	 */

	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(70, 0, 1228, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHThngTuyn = new JLabel("HỆ THỐNG XEM ĐIỂM THI TUYỂN SINH ĐẠI HỌC QUỐC GIA");
		lblHThngTuyn.setForeground(new Color(102, 0, 0));
		lblHThngTuyn.setFont(new Font("Arial", Font.BOLD, 19));
		lblHThngTuyn.setBounds(339, 11, 547, 39);
		contentPane.add(lblHThngTuyn);

		btnTipTc = new JButton("Tìm kiếm");
		btnTipTc.addActionListener(this);

		btnTipTc.setBackground(new Color(245, 245, 245));
		btnTipTc.setBounds(748, 158, 89, 23);
		contentPane.add(btnTipTc);

		JLabel lblChnTrng = new JLabel("Cụm thi");
		lblChnTrng.setFont(new Font("Arial", Font.PLAIN, 14));
		lblChnTrng.setBounds(39, 88, 94, 24);
		contentPane.add(lblChnTrng);

		ArrayList<String> cum = new ArrayList<>();
		String[] stockArrCum = new String[ts.getListCumThi().size()];
		for (CumThi objCum : ts.getListCumThi()) {
			cum.add(objCum.getTen_cum());
		}
		stockArrCum = cum.toArray(stockArrCum);

		comboBox_1 = new JComboBox(stockArrCum);
		comboBox_1.setBackground(new Color(245, 245, 245));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_1.setBounds(111, 86, 245, 24);
		contentPane.add(comboBox_1);

		JLabel lblNewLabel_2 = new JLabel("Nhập ô tìm kiếm");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(362, 153, 110, 30);
		contentPane.add(lblNewLabel_2);

		JLabel lblNm = new JLabel("Năm");
		lblNm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNm.setBounds(1011, 88, 43, 24);
		contentPane.add(lblNm);

		ArrayList<String> nam = new ArrayList<>();
		String[] stockArrNam = new String[ts.getListNam().size()];
		for (Nam objNam : ts.getListNam()) {
			nam.add(objNam.getNam());
		}
		stockArrNam = nam.toArray(stockArrNam);
		comboBox = new JComboBox(stockArrNam);
		comboBox.setBackground(new Color(245, 245, 245));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(1052, 90, 110, 20);
		contentPane.add(comboBox);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tìm theo tên");
		rdbtnNewRadioButton.setBackground(new Color(204, 255, 204));
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(405, 74, 125, 50);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("ten");

		JRadioButton rdbtnTmTheoS = new JRadioButton("Tìm theo số bá danh");
		rdbtnTmTheoS.setBackground(new Color(204, 255, 204));
		rdbtnTmTheoS.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnTmTheoS.setBounds(561, 75, 175, 50);
		contentPane.add(rdbtnTmTheoS);
		rdbtnTmTheoS.setActionCommand("bdanh");

		JRadioButton rdbtnTmTheoS_1 = new JRadioButton("Tìm theo số chứng minh thư");
		rdbtnTmTheoS_1.setBackground(new Color(204, 255, 204));
		rdbtnTmTheoS_1.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnTmTheoS_1.setBounds(761, 75, 203, 50);
		contentPane.add(rdbtnTmTheoS_1);
		rdbtnTmTheoS_1.setActionCommand("mthu");

		rdbtnNewRadioButton.setSelected(true);

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnTmTheoS);
		buttonGroup.add(rdbtnTmTheoS_1);

		getContentPane().add(rdbtnNewRadioButton);
		getContentPane().add(rdbtnTmTheoS);
		getContentPane().add(rdbtnTmTheoS_1);

		newTextField();
		newTableModel();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTipTc) {
			Socket socket;
			DataInputStream in;
			DataOutputStream out;
			try {
				socket = new Socket("localhost", 7000);
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				out.writeUTF(getSearchString());
				out.flush();
				
				setDataFromServer(in);
				
				showTableModel();
				
				in.close();
				out.close();
				socket.close();
			} catch (IOException | JSONException e1) {
				e1.printStackTrace();
			}
		}

	}

	private void newTextField() {
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 245));
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(493, 156, 221, 26);
		textField.setColumns(10);
		contentPane.add(textField);
	}

	private void newTableModel() {
		String[] result = { 
			"STT",
			"Số bá danh",
			"Họ và tên",
			"Ngày Sinh",
			"Số chứng minh",
			"Khối thi",
			"Điểm môn 1",
			"Điểm môn 2",
			"Điểm môn 3"
		};
		
		tableModel.setColumnIdentifiers(result);
	}

	private void setDataForModelTable() {
		tableModel.getDataVector().removeAllElements();
		tableModel.fireTableDataChanged();
		for (String rows[] : arr) {
			tableModel.addRow(rows);
		}
	}

	private void showTableModel() {
		setDataForModelTable();
		
		if (modlePane == null) {
			modlePane = new JPanel();
			modlePane.setBounds(83, 223, 1051, 440);
			
			jtable.setModel(tableModel);
			
			JScrollPane scroll = new JScrollPane(jtable);
			scroll.setSize(1051, 440);
			
			modlePane.add(scroll);
			contentPane.add(modlePane);
		} else {
			modlePane.repaint();
		}
	}

	private void setDataFromServer(DataInputStream in) throws JSONException, IOException {
		JSONArray jsonArray = new JSONArray(in.readUTF());
		String rows[] = null;
		JSONArray tmpJsonArray;
		arr.clear();
		for (int i = 0; i < jsonArray.length(); i++) {
			tmpJsonArray = (JSONArray) jsonArray.get(i);
			rows = new String[tmpJsonArray.length()];
			for (int j = 0; j < tmpJsonArray.length(); j++) {
				rows[j] = (String) tmpJsonArray.get(j);
			}
			arr.add(rows);
		}
	}

	private String getSearchString() {
		String search = textField.getText();
		String jradio = buttonGroup.getSelection().getActionCommand();
		String cumThi = comboBox_1.getSelectedItem().toString();
		String nam = comboBox.getSelectedItem().toString();
		
		int id_cum = 0;
		for (CumThi objCum : ts.Cum(cumThi)) {
			id_cum = objCum.getId();
		}
		
		int id_nam = 0;
		for (Nam objNam : ts.Nam(nam)) {
			id_nam = objNam.getId();
		}
		
		return search + "#" + jradio + "#" + id_cum + "#" + id_nam;
	}
}
