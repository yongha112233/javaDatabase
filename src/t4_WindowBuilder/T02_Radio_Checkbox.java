package t4_WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T02_Radio_Checkbox {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	public static void main(String[] args) {
		new T02_Radio_Checkbox();
		
	}


	public T02_Radio_Checkbox() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setTitle("라디오/체크박스 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.CYAN);
		pn1.setBounds(12, 10, 760, 81);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("라디어버튼/ 체크박스 연습");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("굴림", Font.BOLD, 30));
		lblTitle.setBounds(0, 0, 760, 81);
		pn1.add(lblTitle);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(Color.WHITE);
		pn2.setBounds(12, 96, 760, 372);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblGender = new JLabel("성별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.BOLD, 18));
		lblGender.setBounds(72, 63, 107, 41);
		pn2.add(lblGender);
		
		JLabel lblHobby = new JLabel("취미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.BOLD, 18));
		lblHobby.setBounds(72, 142, 107, 41);
		pn2.add(lblHobby);
		
		JRadioButton rdMale = new JRadioButton("남자");
		buttonGroup.add(rdMale);
		rdMale.setBackground(Color.WHITE);
		rdMale.setFont(new Font("굴림", Font.BOLD, 18));
		rdMale.setBounds(220, 63, 121, 41);
		pn2.add(rdMale);
		
		JRadioButton rdFeMale = new JRadioButton("여자");
		rdFeMale.setSelected(true);
		buttonGroup.add(rdFeMale);
		rdFeMale.setBackground(Color.WHITE);
		rdFeMale.setFont(new Font("굴림", Font.BOLD, 18));
		rdFeMale.setBounds(389, 63, 121, 41);
		pn2.add(rdFeMale);
		
		JCheckBox ckHobby1 = new JCheckBox("등산");
		ckHobby1.setBackground(Color.WHITE);
		ckHobby1.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby1.setBounds(220, 152, 68, 23);
		pn2.add(ckHobby1);
		
		JCheckBox ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setBackground(Color.WHITE);
		ckHobby2.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby2.setBounds(316, 152, 68, 23);
		pn2.add(ckHobby2);
		
		JCheckBox ckHobby3 = new JCheckBox("수영");
		ckHobby3.setBackground(Color.WHITE);
		ckHobby3.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby3.setBounds(416, 152, 68, 23);
		pn2.add(ckHobby3);
		
		JCheckBox ckHobby4 = new JCheckBox("바둑");
		ckHobby4.setBackground(Color.WHITE);
		ckHobby4.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby4.setBounds(511, 152, 68, 23);
		pn2.add(ckHobby4);
		
		JCheckBox ckHobby5 = new JCheckBox("바이크");
		ckHobby5.setBackground(Color.WHITE);
		ckHobby5.setFont(new Font("굴림", Font.BOLD, 18));
		ckHobby5.setBounds(611, 152, 81, 23);
		pn2.add(ckHobby5);
		
		JLabel lblMessage = new JLabel("메세지가 출력 됩니다.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD, 20));
		lblMessage.setBounds(43, 229, 678, 105);
		pn2.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.PINK);
		pn3.setBounds(12, 478, 760, 81);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.BOLD, 18));
		btnGender.setBounds(108, 25, 109, 34);
		pn3.add(btnGender);
		
		JButton btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.BOLD, 18));
		btnHobby.setBounds(325, 25, 109, 34);
		pn3.add(btnHobby);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		btnExit.setBounds(542, 25, 109, 34);
		pn3.add(btnExit);
	
		frame.setVisible(true);
		
//		---------------------------------------------위쪽은 디자인 아래쪽은 메소드---------------------------------------------
		
		// 취미 출력버튼 클릭시 수행
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "선택하신 취미는? ";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + "/";
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + "/";
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + "/";
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + "/";
				if(ckHobby5.isSelected()) hobby += ckHobby5.getText() + "/";
				
				hobby = hobby.substring(0, hobby.length()-1);
				
				lblMessage.setText(hobby);
			}
		});
		
		// 성별 출력버튼 클릭시 수행
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은? "; 
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFeMale.getText();
				
				lblMessage.setText(gender);
			}
		});

		// 종료버튼을 마우스로 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		

	}
}
