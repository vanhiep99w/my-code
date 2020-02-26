package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import model.Request;
import model.Student;

public class ClientView extends JFrame implements ActionListener, ItemListener {
	private JPanel contentPane;
	private JLabel lbTitle, lbFilter, lbSearch, lbSort, lbResult;
	private JRadioButton radBtn1, radBtn2, radBtn3;
	private ButtonGroup btnGr;
	private JComboBox<String> cbx;
	private String[] items = { "Giảm dần", "Tăng dần" };
	private JTextField txt;
	private JButton btn1, btn2, btnDetail;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private String[] columnNames = { "SBD", "Họ Tên", "Địa Chỉ", "Ngày Sinh", "Khối thi", "Tổng điểm" };
	private Socket socket = null;
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	private ArrayList<Student> listStudents = null;
	private Detail detailStudent;

	public ClientView(String title) {
		super(title);
		GUI();
		setBounds(300, 100, 591, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		createSocket();
		if (socket != null) {
			createObjectIOStream();
		}
	}

	private void GUI() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbTitle = new JLabel("TRA CỨU ĐIỂM THI TUYỂN SINH ĐẠI HỌC");
		lbTitle.setBounds(100, 11, 450, 20);
		lbTitle.setFont(new Font("Serif", Font.BOLD, 20));
		lbTitle.setForeground(Color.RED);
		contentPane.add(lbTitle);

		lbFilter = new JLabel("Tìm kiếm theo:");
		lbFilter.setBounds(10, 57, 83, 14);
		contentPane.add(lbFilter);

		radBtn1 = new JRadioButton("Tên thí sinh", true);
		radBtn1.setBounds(98, 53, 109, 23);
		contentPane.add(radBtn1);

		radBtn2 = new JRadioButton("Số báo danh");
		radBtn2.setBounds(213, 53, 109, 23);
		contentPane.add(radBtn2);

		btnGr = new ButtonGroup();
		btnGr.add(radBtn1);
		btnGr.add(radBtn2);

		lbSort = new JLabel("Tổng điểm:");
		lbSort.setBounds(385, 57, 94, 14);
		contentPane.add(lbSort);

		cbx = new JComboBox<>(items);
		cbx.setBounds(484, 57, 89, 20);
		contentPane.add(cbx);

		lbSearch = new JLabel("Nhập nội dung:");
		lbSearch.setBounds(10, 94, 83, 14);
		contentPane.add(lbSearch);

		txt = new JTextField();
		txt.setBounds(98, 91, 273, 20);
		contentPane.add(txt);
		txt.setColumns(10);

		btn1 = new JButton("Tìm kiếm");
		btn1.setBounds(385, 88, 89, 23);
		contentPane.add(btn1);

		btn2 = new JButton("Reset");
		btn2.setBounds(484, 88, 89, 23);
		contentPane.add(btn2);

		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// all cells false
				return false;
			}
		};
		table = new JTable(model);
		scroll = new JScrollPane(table);
		scroll.setBounds(1, 122, 584, 202);
		contentPane.add(scroll);
		configTable();

		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.green);

		lbResult = new JLabel("");
		lbResult.setBounds(10, 335, 400, 14);
		contentPane.add(lbResult);

		btnDetail = new JButton("Xem chi tiết");
		btnDetail.setBounds(464, 331, 109, 23);
		contentPane.add(btnDetail);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btnDetail.addActionListener(this);
		cbx.addItemListener(this);

		detailStudent = new Detail();
	}

	private void createSocket() {
		try {
			socket = new Socket(Server.IP, Server.PORT);
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(contentPane, "Server chưa start!");
		}
	}

	private void createObjectIOStream() {
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
		}
	}

	private void configTable() {
		model.setColumnIdentifiers(columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(220);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			if (socket == null) {
				createSocket();
				if (socket != null && ois == null && oos == null)
					createObjectIOStream();
			} 
			if (socket != null && ois != null && oos != null) {
				String text = txt.getText().trim();
				if ("".equals(text)) {
					JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập vào nội dung cần tìm");
				} else {
					Request request = null;
					boolean isValid = true;
					if (radBtn1.isSelected()) {
						request = new Request(1, text);
					}
					if (radBtn2.isSelected()) {
						try {
							int num = Integer.parseInt(text);
							request = new Request(2, text);
						} catch (NumberFormatException ex) {
							JOptionPane.showMessageDialog(contentPane, "Số báo danh phải là số!");
							isValid = false;
						}
					}

					if (isValid) {
						sendRequest(request);
						listStudents = getData();
						clearTable();
						sortData();
						viewDataInTable();
						updateLabelResult();
					} else {
						clearTable();
						clearData();
						lbResult.setText("");
					}
				}
			}
		}

		if (e.getSource() == btn2) {
			txt.setText("");
			clearTable();
			clearData();
			lbResult.setText("");
		}

		if (e.getSource() == btnDetail) {
			int i = table.getSelectedRow();
			if (i > -1) {
				detailStudent.setVisible(true);
				detailStudent.setResizable(false);
				detailStudent.setLocationRelativeTo(null);
				detailStudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				loadDataDetail(i);
			} else {
				JOptionPane.showMessageDialog(contentPane, "Vui lòng chọn học sinh để xem chi tiết!");
			}
		}

	}

	private void loadDataDetail(int i) {
		Student std = listStudents.get(i);
		detailStudent.setLbName(std.getName());
		detailStudent.setLbAddress(std.getAddress());
		detailStudent.setLbDob(new SimpleDateFormat("dd/MM/yyyy").format(std.getDateOfBirth()));
		detailStudent.setLbKhoi(std.getKhoi());
		detailStudent.setLbSub1(std.getFirstSubject() + ":");
		detailStudent.setLbSub1Score(std.getFirstScore() + "");
		detailStudent.setLbSub2(std.getSecondSubject() + ":");
		detailStudent.setLbSub2Score(std.getSecondScore() + "");
		detailStudent.setLbSub3(std.getThirdSubject() + ":");
		detailStudent.setLbSub3Score(std.getThirdScore() + "");
		detailStudent.setLbTotal(String.format("%.1f", std.getTotalScores()));
		sendRequest(new Request(3, std.getIdKhoi() + ""));
		ArrayList<Student> list = getData();
		int rank = getRank(list, std);
		detailStudent.setLbRank(rank + "/" + list.size());
		detailStudent.setLbKQ(classify(std.getTotalScores()));
	}

	private int classify(float score) {
		return score > 25 ? 1 : (score > 20 ? 2 : (score > 15 ? 3 : 4));
	}
	
	private int getRank(ArrayList<Student> list, Student std) {
		if (list.size() > 0) {
			Collections.sort(list, new Comparator<Student>() {
				@Override
				public int compare(Student s1, Student s2) {
					if (s1.getTotalScores() == s2.getTotalScores())
						return 0;
					else if (s1.getTotalScores() > s2.getTotalScores())
						return -1;
					return 1;
				}
			});
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTotalScores() == std.getTotalScores())
				return i + 1;
		}
		return 0;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (listStudents != null && listStudents.size() > 0) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				System.out.println(ItemEvent.SELECTED);
				sortData();
				clearTable();
				viewDataInTable();
			}
		}
	}

	private void sortData() {
		if (listStudents != null && listStudents.size() > 0) {
			if (cbx.getSelectedIndex() == 0) {
				// Giảm dần
				Collections.sort(listStudents, new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						if (s1.getTotalScores() == s2.getTotalScores())
							return 0;
						else if (s1.getTotalScores() > s2.getTotalScores())
							return -1;
						return 1;
					}
				});
			} else {
				// Tăng dần
				Collections.sort(listStudents, new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						if (s1.getTotalScores() == s2.getTotalScores())
							return 0;
						else if (s1.getTotalScores() > s2.getTotalScores())
							return 1;
						return -1;
					}
				});
			}
		}
	}

	private void updateLabelResult() {
		if (listStudents != null && listStudents.size() > 0) {
			String key = radBtn1.isSelected() ? "tên" : "số báo danh";
			lbResult.setText("Tìm thấy " + listStudents.size() + " học sinh có " + key + " phù hợp với \""
					+ txt.getText() + "\"");
		}
	}

	private void viewDataInTable() {
		if (listStudents != null && listStudents.size() > 0) {
			String sbd, dateOfBirth, khoiThi, totalScore;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			for (Student std : listStudents) {
				sbd = std.getId() + "";
				dateOfBirth = sdf.format(std.getDateOfBirth());
				khoiThi = std.getKhoi();
				totalScore = String.format("%.1f", std.getTotalScores());
				model.addRow(new String[] { sbd, std.getName(), std.getAddress(), dateOfBirth, khoiThi, totalScore });
			}
		} else {
			JOptionPane.showMessageDialog(contentPane, "Không tìm thấy nội dung!");
			String key = radBtn1.isSelected() ? "tên" : "số báo danh";
			lbResult.setText("Không tìm thấy học sinh có " + key + " phù hợp với \"" + txt.getText() + "\"");
		}
	}

	private void clearData() {
		this.listStudents = null;
	}

	private void clearTable() {
		while (table.getRowCount() > 0) {
			model.removeRow(0);
		}
		table.setModel(model);
	}

	private ArrayList<Student> getData() {
		try {
			return (ArrayList<Student>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void sendRequest(Request request) {
		try {
			oos.writeObject(request);
			oos.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ClientView("Tra cứu điểm thi đại học");
	}

}
