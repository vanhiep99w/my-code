package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Detail extends JFrame {

	private JPanel contentPane;
	private JLabel lbName, lbAddress, lbDob, lbKhoi, lbSub1, lbSub1Score, lbSub2, lbSub2Score, lbSub3, lbSub3Score,
			lbTotal, lbRank, lbKQ;

	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detail frame = new Detail();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Detail() {
		setSize(320, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTitle = new JLabel("THÔNG TIN CHI TIẾT");
		lbTitle.setBounds(85, 11, 150, 17);
		lbTitle.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbTitle);

		JLabel lblHVTn = new JLabel("Họ và tên:");
		lblHVTn.setBounds(42, 51, 64, 14);
		contentPane.add(lblHVTn);

		lbName = new JLabel();
		lbName.setBounds(116, 51, 138, 17);
		lbName.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbName);

		JLabel lblaCh = new JLabel("Địa chỉ:");
		lblaCh.setBounds(42, 76, 46, 14);
		contentPane.add(lblaCh);

		lbAddress = new JLabel();
		lbAddress.setBounds(116, 76, 102, 17);
		lbAddress.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbAddress);

		JLabel lblNgySinh = new JLabel("Ngày sinh:");
		lblNgySinh.setBounds(42, 101, 60, 14);
		contentPane.add(lblNgySinh);

		lbDob = new JLabel();
		lbDob.setBounds(116, 101, 87, 17);
		lbDob.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbDob);

		JLabel lblKhiThi = new JLabel("Khối thi:");
		lblKhiThi.setBounds(42, 126, 46, 14);
		contentPane.add(lblKhiThi);

		lbKhoi = new JLabel();
		lbKhoi.setBounds(116, 126, 46, 17);
		lbKhoi.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbKhoi);

		lbSub1 = new JLabel("Hóa:");
		lbSub1.setBounds(172, 126, 64, 14);
		contentPane.add(lbSub1);

		lbSub1Score = new JLabel("8");
		lbSub1Score.setBounds(240, 126, 54, 17);
		lbSub1Score.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbSub1Score);

		lbSub2 = new JLabel("Toán:");
		lbSub2.setBounds(42, 151, 74, 14);
		contentPane.add(lbSub2);

		lbSub2Score = new JLabel("9");
		lbSub2Score.setBounds(116, 151, 46, 17);
		lbSub2Score.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbSub2Score);

		lbSub3 = new JLabel("Lý:");
		lbSub3.setBounds(172, 151, 64, 14);
		contentPane.add(lbSub3);

		lbSub3Score = new JLabel("8");
		lbSub3Score.setBounds(240, 151, 54, 14);
		lbSub3Score.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbSub3Score);

		JLabel lblTngim = new JLabel("Tổng điểm:");
		lblTngim.setBounds(42, 176, 64, 14);
		contentPane.add(lblTngim);

		lbTotal = new JLabel("30");
		lbTotal.setBounds(116, 176, 46, 17);
		lbTotal.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbTotal);

		JLabel lblVTr = new JLabel("Vị trí:");
		lblVTr.setBounds(172, 176, 54, 14);
		contentPane.add(lblVTr);

		lbRank = new JLabel("5");
		lbRank.setBounds(240, 176, 64, 17);
		lbRank.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(lbRank);

		lbKQ = new JLabel("You are good!", SwingConstants.CENTER);
		lbKQ.setBounds(70, 201, 180, 18);
		lbKQ.setFont(new Font("Serif", Font.BOLD, 16));
		contentPane.add(lbKQ);
	}

	public JLabel getLbName() {
		return lbName;
	}

	public void setLbName(String lbName) {
		this.lbName.setText(lbName);
	}

	public JLabel getLbAddress() {
		return lbAddress;
	}

	public void setLbAddress(String lbAddress) {
		this.lbAddress.setText(lbAddress);
	}

	public JLabel getLbDob() {
		return lbDob;
	}

	public void setLbDob(String lbDob) {
		this.lbDob.setText(lbDob);
	}

	public JLabel getLbKhoi() {
		return lbKhoi;
	}

	public void setLbKhoi(String lbKhoi) {
		this.lbKhoi.setText(lbKhoi);
	}

	public JLabel getLbSub1() {
		return lbSub1;
	}

	public void setLbSub1(String lbSub1) {
		this.lbSub1.setText(lbSub1);
	}

	public JLabel getLbSub1Score() {
		return lbSub1Score;
	}

	public void setLbSub1Score(String lbSub1Score) {
		this.lbSub1Score.setText(lbSub1Score);
	}

	public JLabel getLbSub2() {
		return lbSub2;
	}

	public void setLbSub2(String lbSub2) {
		this.lbSub2.setText(lbSub2);
	}

	public JLabel getLbSub2Score() {
		return lbSub2Score;
	}

	public void setLbSub2Score(String lbSub2Score) {
		this.lbSub2Score.setText(lbSub2Score);
	}

	public JLabel getLbSub3() {
		return lbSub3;
	}

	public void setLbSub3(String lbSub3) {
		this.lbSub3.setText(lbSub3);
	}

	public JLabel getLbSub3Score() {
		return lbSub3Score;
	}

	public void setLbSub3Score(String lbSub3Score) {
		this.lbSub3Score.setText(lbSub3Score);
	}

	public JLabel getLbTotal() {
		return lbTotal;
	}

	public void setLbTotal(String lbTotal) {
		this.lbTotal.setText(lbTotal);
	}

	public JLabel getLbRank() {
		return lbRank;
	}

	public void setLbRank(String lbRank) {
		this.lbRank.setText(lbRank);
	}

	public JLabel getLbKQ() {
		return lbKQ;
	}

	public void setLbKQ(int xl) {
		if (xl == 1) {
			this.lbKQ.setText("EXCELLENT!");
			this.lbKQ.setForeground(Color.RED);
		} else if (xl == 2) {
			this.lbKQ.setText("GOOD!");
			this.lbKQ.setForeground(Color.GREEN);
		} else if (xl == 3) {
			this.lbKQ.setText("TRY MORE!");
			this.lbKQ.setForeground(Color.BLUE);
		} else {
			this.lbKQ.setText("BAD! STUDY HARDER!");
			this.lbKQ.setForeground(Color.BLACK);
		}
	}

}
